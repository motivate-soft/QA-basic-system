package elastic.qa.distilbert.interfaces;

//import x.models.VoteCount;

import elastic.qa.distilbert.models.VoteCount;

public interface IVoteStore {
  /**
   * Adds a vote to associated with the given AnsweredQuestion ID.
   * @param id AnsweredQuestion ID to vote on.
   * @param service The service that provided the AnsweredQuestion.
   * @param vote True for an up vote, false for a down vote.
   * @return True if the vote was successfully recorded, false otherwise.
   */
  boolean addVote(String id, String service, boolean vote);

  /**
   * Gets all of the votes cast on a given services answered questions.
   * @param service Service to get votes for.
   * @return Services vote counts.
   */
  VoteCount getVotes(String service);
}
