package elastic.qa.distilbert.models;

import java.util.List;

public class DataInfo {
  private String service, version;
  private List<Document> document;

  /**
   * Gets the associated service name.
   * @return Service name.
   */
  public String getService() {
    return service;
  }

  /**
   * Sets the requested service name.
   * @param service Service name.
   */
  public void setService(String service) {
    this.service = service;
  }

  /**
   * Gets the associated version.
   * @return Version name.
   */
  public String getVersion() {
    return version;
  }

  /**
   * Sets the version.
   * @param version Version name.
   */
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Gets the document object.
   * @return Document object.
   */
  public List<Document> getDocument() {
    return document;
  }

  /**
   * Sets the document object.
   * @param document Document object.
   */
  public void setDocument(List<Document> document) {
    this.document = document;
  }
}
