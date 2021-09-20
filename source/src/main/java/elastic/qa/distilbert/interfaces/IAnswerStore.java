package elastic.qa.distilbert.interfaces;

//import x.models.Answer;
//import x.models.AnsweredQuestion;
//import x.models.Result;

import elastic.qa.distilbert.models.AnsweredQuestion;
import elastic.qa.distilbert.models.Result;

public interface IAnswerStore {
  /**
   * Gets the result specified by the given ID.  Optionally returns the surrounding results.
   * @param id ID of the requested Result object.
   * @param service Name of the service the Result came from.
   * @param getSurrounding True to get surrounding results, false for just the requested answer.
   * @return An array with 1-3 Result objects.
   */
  Result[] getResult(String id, String service, boolean getSurrounding);

  /**
   * Gets the answered question specified by the given ID.
   * @param id ID of the requested AnsweredQuestion object.
   * @param service Name of the service the AnsweredQuestion came from.
   * @return Requested AnsweredQuestion object.
   */
  AnsweredQuestion getAnswer(String id, String service);

  /**
   * Store the given array of AnsweredQuestion objects that came from the given service name.
   * @param service Service name.
   * @param answeredQuestions AnsweredQuestion array.
   * @return True if they were successfully stored, false otherwise.
   */
  boolean storeAnsweredQuestions(String service, AnsweredQuestion[] answeredQuestions);
}
