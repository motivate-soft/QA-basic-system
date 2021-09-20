package elastic.qa.distilbert.models;

public class Answer {
  private String id, qaAnswer;
  private Result result;

  /**
   * Generic constructor for Answer object.  Builds with a blank ID.  Should only be used for test
   * or mock purposes.
   */
  public Answer() {
    this("");
  }

  /**
   * Typical constructor for Answer object.
   * @param id The ID associated with this Answer object.
   */
  public Answer(String id) {
    this.id = id;
  }

  /**
   * Gets the Answer ID string.
   * @return Answer ID.
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the QA service built answer string.
   * @return QA answer.
   */
  public String getQaAnswer() {
    return qaAnswer;
  }

  /**
   * Get the Result object for this answer.
   * @return Result object.
   */
  public Result getResult() {
    return result;
  }

  /**
   * Set the ID for this Answer.
   * @param id ID for this Answer.
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Set the QA service built answer string.
   * @param qaAnswer QA answer.
   */
  public void setQaAnswer(String qaAnswer) {
    this.qaAnswer = qaAnswer;
  }

  /**
   * Set the Result object for this answer.
   * @param result Result object.
   */
  public void setResult(Result result) {
    this.result = result;
  }
}
