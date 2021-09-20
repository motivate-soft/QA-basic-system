package elastic.qa.distilbert.models;

public class Data {
  private String service;
  private Document document;

  /**
   * Gets the service this data is/should be registered with.
   * @return Service string.
   */
  public String getService() {
    return service;
  }

  /**
   * Gets the Document associated with this Data object.
   * @return Document object.
   */
  public Document getDocument() {
    return document;
  }

  /**
   * Set the service that this data is/should be registered with.
   * @param service Service string.
   */
  public void setService(String service) {
    this.service = service;
  }

  /**
   * Sets the Document to associate with this Data object.
   * @param document Document object.
   */
  public void setDocument(Document document) {
    this.document = document;
  }
}
