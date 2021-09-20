package elastic.qa.distilbert.models;

import java.util.List;
import java.util.Map;

public class ElasticData extends Data {
  private List<Map<String, Object>> mapData;

  /**
   * Construct the object with required Map object of data.
   * @param mapData Data Map object.
   */
  public ElasticData(List<Map<String, Object>> mapData) {
    this.mapData = mapData;
  }

  /**
   * Get the data that will be stored in ElasticSearch
   * @return Data Map object.
   */
  public List<Map<String, Object>> getMapData() {
    return mapData;
  }
}
