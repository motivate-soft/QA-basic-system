package elastic.qa.distilbert.models;

public class AnswerVotes {
  private AnsweredQuestion answeredQuestion;
  private int upVotes, downVotes;
  private String id;

  /**
   * Gets the AnsweredQuestion object that these votes were cast on.
   * @return AnsweredQuestion object.
   */
  public AnsweredQuestion getAnsweredQuestion() {
    return answeredQuestion;
  }

  /**
   * Get the total number of up votes associated with this question/answer pair.
   * @return Up vote count.
   */
  public int getUpVotes() {
    return upVotes;
  }

  /**
   * Get the total number of down votes associated with this question/answer pair.
   * @return Down vote count.
   */
  public int getDownVotes() {
    return downVotes;
  }

  /**
   * Get the ID String.  Should match AnsweredQue
   * @return
   */
  public String getId() {
    return id;
  }

  /**
   * Set the AnsweredQuestion object that these votes were cast on.
   * @param answeredQuestion AnsweredQuestion object.
   */
  public void setAnsweredQuestion(AnsweredQuestion answeredQuestion) {
    this.answeredQuestion = answeredQuestion;
  }

  /**
   * Set the number of up cotes associated with this question/answer pair.
   * @param upVotes Up vote count.
   */
  public void setUpVotes(int upVotes) {
    this.upVotes = upVotes;
  }

  /**
   * Set the number of down cotes associated with this question/answer pair.
   * @param downVotes Down vote count.
   */
  public void setDownVotes(int downVotes) {
    this.downVotes = downVotes;
  }

  /**
   *
   * @param id
   */
  public void setId(String id) {
    this.id = id;
  }
}
