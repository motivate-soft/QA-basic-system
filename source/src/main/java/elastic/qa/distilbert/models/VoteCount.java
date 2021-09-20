package elastic.qa.distilbert.models;

public class VoteCount {
  private AnswerVotes[] answers;
  private ModelInfo[] modelsUsed;

  /**
   * Gets an array of AnsweredQuestions associated with their votes.
   * @return AnswerVotes array.
   */
  public AnswerVotes[] getAnswers() {
    return answers;
  }

  /**
   * Gets an array of ModelInfo for all of the models used.
   * @return ModelInfo array.
   */
  public ModelInfo[] getModelsUsed() {
    return modelsUsed;
  }

  /**
   * Sets an array of AnsweredQuestions associated with their votes.
   * @param answers AnswerVotes array.
   */
  public void setAnswers(AnswerVotes[] answers) {
    this.answers = answers;
  }

  /**
   * Gets an array of ModelInfo for all of the models used.
   * @param modelsUsed ModelInfo array.
   */
  public void setModelsUsed(ModelInfo[] modelsUsed) {
    this.modelsUsed = modelsUsed;
  }
}
