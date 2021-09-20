package elastic.qa.distilbert.models;

public class Result {
  private String id, foundText, service, documentID;
  private int page;

  /**
   * Generic constructor for Result object.  Builds with a blank ID.  Should only be used for test
   * or mock purposes.
   */
  public Result() {
    this("");
  }

  /**
   * Typical constructor for the Result object.
   * @param id The ID associated with this Result object.
   */
  public Result(String id) {
    this.id = id;
  }

  /**
   * Gets the Result ID string.
   * @return Result ID.
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the exact text found in the document.
   * @return Found text.
   */
  public String getFoundText() {
    return foundText;
  }

  /**
   * Gets the service associated with this Result object.
   * @return Service name.
   */
  public String getService() {
    return service;
  }

  /**
   * Gets the ID of the document this Result came from.
   * @return Document ID.
   */
  public String getDocumentID() {
    return documentID;
  }

  /**
   * Gets the page of the document this Result was found on.
   * @return Document page.
   */
  public int getPage() {
    return page;
  }

  /**
   * Sets the exact text found in the document.
   * @param foundText Found text.
   */
  public void setFoundText(String foundText) {
    this.foundText = foundText;
  }

  /**
   * Sets the service associated with this Result object.
   * @param service Service name.
   */
  public void setService(String service) {
    this.service = service;
  }

  /**
   * Sets the ID of the document this Result came from.
   * @param documentID Document ID.
   */
  public void setDocumentID(String documentID) {
    this.documentID = documentID;
  }

  /**
   * Sets the page of the document this Result was found on.
   * @param page Document page.
   */
  public void setPage(int page) {
    this.page = page;
  }
}
