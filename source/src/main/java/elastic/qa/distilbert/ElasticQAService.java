package elastic.qa.distilbert;

//import x.DBManager;
//import x.interfaces.IDataStore;
//import x.interfaces.IQAService;
//import x.models.Answer;
//import x.models.AnsweredQuestion;
//import x.models.Data;
//import x.models.Result;

import elastic.qa.distilbert.interfaces.IDataStore;
import elastic.qa.distilbert.interfaces.IQAService;
import elastic.qa.distilbert.models.Answer;
import elastic.qa.distilbert.models.AnsweredQuestion;
import elastic.qa.distilbert.models.Data;
import elastic.qa.distilbert.models.Result;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ElasticQAService implements IQAService {
//  private DBManager manager;
  private String service;

  public ElasticQAService(String service) {
    this.service = service;
//    manager = DBManager.getInstance();
  }
  /**
   * Answers the given question.
   *
   * @param question   Question to answer.
   * @param services   The services to use to answer this question.
   * @param maxAnswers The maximum number of answers to return.
   * @param applyQA    Whether to apply question answering or just return results.
   * @return AnsweredQuestion array.
   */
//  @Override
  public AnsweredQuestion[] answerQuestion(String question, String[] services, int maxAnswers, boolean applyQA) {

    AnsweredQuestion[] answers = new AnsweredQuestion[maxAnswers];
    Result result = new Result();
    int ans = 0;

    String filePath = "engine/main.py";
    try {
      ProcessBuilder pb = new ProcessBuilder().command("python", "-u", filePath, question);
      Process p = pb.start();
      BufferedReader stdInput = new BufferedReader(new
              InputStreamReader(p.getInputStream()));

      BufferedReader stdError = new BufferedReader(new
              InputStreamReader(p.getErrorStream()));

      StringBuilder buffer = new StringBuilder();
      String line = null;
      while ((line = stdInput.readLine()) != null){
        buffer.append(line);
      }

      int exitCode = p.waitFor();
      System.out.println("Question: " + question);
      System.out.println("Answer: " + buffer.toString());
      result.setFoundText(buffer.toString());


      stdInput.close();
    } catch (IOException e) {
      System.out.println("exception happened - here's what I know: ");
      e.printStackTrace();
      System.exit(-1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    AnsweredQuestion answeredQuestion = new AnsweredQuestion();
    Answer answer = new Answer();
    answer.setResult(result);
    answer.setQaAnswer("");
    answeredQuestion.setAnswer(answer);
    answeredQuestion.setQuestion(question);

    answers[ans++] = answeredQuestion;

//    if (Arrays.stream(services).anyMatch(service::equalsIgnoreCase)) {
//      IDataStore dataStore = (IDataStore)manager.getStore(service, IDataStore.class);
//      Result[] results = dataStore.search(question);
//
//      for (Result result : results) {
//        AnsweredQuestion answeredQuestion = new AnsweredQuestion();
//        Answer answer = new Answer();
//
//        answer.setResult(result);
//        answer.setQaAnswer("");
//        answeredQuestion.setAnswer(answer);
//        answeredQuestion.setQuestion(question);
//
//        answers[ans++] = answeredQuestion;
//
//        if (ans == maxAnswers)
//          break;
//      }
//    }

    return answers;
  }

  /**
   * Add data to the given service.
   *
   * @param service Service to add data to.
   * @param data    Data to add.
   * @param version Version of the given data.
   * @return True if successfully added, false otherwise.
   */
  @Override
  public boolean addData(String service, Data data, String version) {
//    IDataStore dataStore = (IDataStore)manager.getStore(service, IDataStore.class);
//    dataStore.addData(service, data);
    return true;
  }

  /**
   * Replaces the model for the given service.  Should be verified by the QAService prior to full
   * replacement.
   *
   * @param service The service for the replacement model.
   * @param model   A byte array representing the model contents.
   * @param version The version of the provided model.
   * @return True if the model is verified and stored, false otherwise.
   */
  @Override
  public boolean replaceModel(String service, byte[] model, String version) {
    return false;
  }
}