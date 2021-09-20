package elastic.qa.distilbert.models;

public class ModelInfo {
  private String service, version, hash, modelPath, timestamp;

  /**
   * Gets the associated service name.
   * @return Service name.
   */
  public String getService() {
    return service;
  }

  /**
   * Gets the version of the services model.
   * @return Model version.
   */
  public String getVersion() {
    return version;
  }

  /**
   * Gets the MD5 hash for the model.
   * @return Model hash.
   */
  public String getHash() {
    return hash;
  }

  /**
   * Gets the storage path to the given model.
   * @return Storage path of the given model.
   */
  public String getModelPath() {
    return modelPath;
  }

  /**
   * Gets the timestamp at which this model version was stored.  Should be in ISO 8601 date or date
   * and time format.
   * @return The timestamp as a String.
   */
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the requested service name.
   * @param service Service name.
   */
  public void setService(String service) {
    this.service = service;
  }

  /**
   * Sets the version of the services model.
   * @param version Model version.
   */
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Sets the MD5 hash for the model.
   * @param hash Model hash.
   */
  public void setHash(String hash) {
    this.hash = hash;
  }

  /**
   * Sets the path of the stored model.
   * @param modelPath Storage path.
   */
  public void setModelPath(String modelPath) {
    this.modelPath = modelPath;
  }

  /**
   * Gets the timestamp at which this model version was stored.  Should be in ISO 8601 date or date
   * and time format.  Easiest way to achieve this is the {@link java.time.Instant} toString method.
   * @param timestamp The timestamp as a String.
   */
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }
}
