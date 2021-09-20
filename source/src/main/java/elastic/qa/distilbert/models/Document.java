package elastic.qa.distilbert.models;

public class Document {
  private String id, name, version, hash;
  private int pages;
  private byte[] bytes;

  /**
   * Gets the ID for this Document object.
   * @return Document ID.
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name of the associated document.
   * @return Document name.
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the associated document's version.
   * @return Document version.
   */
  public String getVersion() {
    return version;
  }

  /**
   * Gets the documents MD5 hash.
   * @return Document hash.
   */
  public String getHash() {
    return hash;
  }

  /**
   * Gets the total page count for the associated document.
   * @return Document page count.
   */
  public int getPages() {
    return pages;
  }

  /**
   * Gets a byte array holding the associated documents contents.
   * @return Document byte array.
   */
  public byte[] getBytes() {
    return bytes;
  }

  /**
   * Sets the ID for this Document object.
   * @param id Document ID.
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the name of the associated document.
   * @param name Document name.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the version of the associated document.
   * @param version Document version.
   */
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Sets the MD5 hash of the associated document.
   * @param hash Document hash.
   */
  public void setHash(String hash) {
    this.hash = hash;
  }

  /**
   * Sets the total page count of the associated document.
   * @param pages Document page count.
   */
  public void setPages(int pages) {
    this.pages = pages;
  }

  /**
   * Sets the byte array holding the associated documents contents.
   * @param bytes Document byte array.
   */
  public void setBytes(byte[] bytes) {
    this.bytes = bytes;
  }
}
