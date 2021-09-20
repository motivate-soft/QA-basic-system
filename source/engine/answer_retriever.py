import torch
from transformers import DistilBertTokenizer, DistilBertForQuestionAnswering

class AnswerRetriever:

    def getAnswer(self, question, questionContext):
        # distilBertTokenizer = DistilBertTokenizer.from_pretrained('./model/base', return_token_type_ids=True)
        # distilBertForQuestionAnswering = DistilBertForQuestionAnswering.from_pretrained(
        #      './model/distilbert-base-uncased-distilled-squad', from_tf=False)
        
        distilBertTokenizer = DistilBertTokenizer.from_pretrained('distilbert-base-uncased', return_token_type_ids=True)
        distilBertForQuestionAnswering = DistilBertForQuestionAnswering.from_pretrained(
           'distilbert-base-uncased-distilled-squad')

        encodings = distilBertTokenizer.encode_plus(question, questionContext)

        inputIds, attentionMask = encodings["input_ids"], encodings["token_type_ids"]

        scoresStart, scoresEnd = distilBertForQuestionAnswering(torch.tensor([inputIds]),
                                                                attention_mask=torch.tensor([attentionMask]))

        tokens = inputIds[torch.argmax(scoresStart): torch.argmax(scoresEnd) + 1]

        answerTokens = distilBertTokenizer.convert_ids_to_tokens(tokens, skip_special_tokens=True)

        return distilBertTokenizer.convert_tokens_to_string(answerTokens)