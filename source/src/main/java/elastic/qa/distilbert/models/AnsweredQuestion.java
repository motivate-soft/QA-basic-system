package elastic.qa.distilbert.models;

public class AnsweredQuestion {
  private String id, question;
  private Answer answer;

  /**
   * Generic constructor for AnsweredQuestion object.  Builds with a blank ID and question.  Should
   * only be used for test or mock purposes.
   */
  public AnsweredQuestion() {
    this("", "");
  }

  /**
   * Typical constructor for AnsweredQuestion objects.
   * @param id The ID associated with this AnsweredQuestion object.
   * @param question The question that generated this AnsweredQuestion object.
   */
  public AnsweredQuestion(String id, String question) {
    this.id = id;
    this.question = question;
  }

  /**
   * Gets the AnsweredQuestion ID string.
   * @return AnsweredQuestion ID.
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the associated question.
   * @return Associated question.
   */
  public String getQuestion() {
    return question;
  }

  /**
   * Gets the associated Answer object.
   * @return Answer object.
   */
  public Answer getAnswer() {
    return answer;
  }

  /**
   * Sets the ID for this AnsweredQuestion.
   * @param id ID to set.
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the question that is answered within this AnsweredQuestion.
   * @param question The question answered.
   */
  public void setQuestion(String question) {
    this.question = question;
  }

  /**
   * Sets the Answer object to associate with the stored question.
   * @param answer Answer object.
   */
  public void setAnswer(Answer answer) {
    this.answer = answer;
  }
}
