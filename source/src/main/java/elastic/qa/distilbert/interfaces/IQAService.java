package elastic.qa.distilbert.interfaces;

//import x.models.AnsweredQuestion;
//import x.models.Data;

import elastic.qa.distilbert.models.AnsweredQuestion;
import elastic.qa.distilbert.models.Data;

public interface IQAService {
  /**
   * Answers the given question.
   * @param question Question to answer.
   * @param services The services to use to answer this question.
   * @param maxAnswers The maximum number of answers to return.
   * @param applyQA Whether to apply question answering or just return results.
   * @return AnsweredQuestion array.
   */
  AnsweredQuestion[] answerQuestion(String question, String[] services, int maxAnswers, boolean applyQA);

  /**
   * Add data to the given service.
   * @param service Service to add data to.
   * @param data Data to add.
   * @param version Version of the given data.
   * @return True if successfully added, false otherwise.
   */
  boolean addData(String service, Data data, String version);

  /**
   * Replaces the model for the given service.  Should be verified by the QAService prior to full
   * replacement.
   * @param service The service for the replacement model.
   * @param model A byte array representing the model contents.
   * @param version The version of the provided model.
   * @return True if the model is verified and stored, false otherwise.
   */
  boolean replaceModel(String service, byte[] model, String version);
}
