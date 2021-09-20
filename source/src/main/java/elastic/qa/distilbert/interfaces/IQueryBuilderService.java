package elastic.qa.distilbert.interfaces;

public interface IQueryBuilderService {
  /**
   * Builds a query string for the given question and the target database.
   * @param question Question to build a query for.
   * @param targetDB Database to target.
   * @return Query string.
   */
  String buildQuery(String question, String targetDB);
}
