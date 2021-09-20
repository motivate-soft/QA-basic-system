package elastic.qa.distilbert.interfaces;

//import x.models.Data;
//import x.models.Document;
//import x.models.Result;

import elastic.qa.distilbert.models.Data;
import elastic.qa.distilbert.models.Document;
import elastic.qa.distilbert.models.Result;

public interface IDataStore {
  /**
   * Adds the given piece of data and associates it with the given service.
   * @param service Service to associate data with.
   * @param data Data object to store.
   * @return The ID of the data stored.
   */
  String addData(String service, Data data);

  /**
   * Gets an array of all of the documents from this IDataStore.
   * @return Document array.
   */
  Document[] getAllDocuments();

  /**
   * Gets the Document object associated with the given service with the given ID.
   * @param service Service associated with the requested document.
   * @param id ID of the requested document.
   * @return Document object.
   */
  Document getDocument(String service, String id);

  /**
   * Gets a list of Document IDs associated with the given service.
   * @param service Service to request Document IDs from.
   * @return Document ID array.
   */
  String[] getDocumentList(String service);

  /**
   * Searches this data store with the given question.
   * @param question Question to use for search.
   * @return Result array.
   */
  Result[] search(String question);
}
