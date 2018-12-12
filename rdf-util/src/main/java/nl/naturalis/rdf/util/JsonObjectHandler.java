package nl.naturalis.rdf.util;

import java.util.Map;

/**
 * Callback interface invoked by the JsonArrayProcessor as it iterates over the objects in a JSON array.
 */
@FunctionalInterface
public interface JsonObjectHandler {

  public void handle(Map<String, Object> obj);

}
