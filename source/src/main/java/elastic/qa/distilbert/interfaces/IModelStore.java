package elastic.qa.distilbert.interfaces;

//import x.models.ModelInfo;

import elastic.qa.distilbert.models.ModelInfo;

public interface IModelStore {
  boolean replaceModel(String service, String version, byte[] model);
  ModelInfo getModelInfo(String service);
}
