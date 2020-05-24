package com.itutry.jackson.demo20;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;

/**
 * Jackson JsonParser使用
 *
 * @author itutry
 * @create 2020-05-24_14:56
 */
public class App {

  public static void main(String[] args) throws IOException {
    String json = "{\"firstName\":\"张\",\"lastName\":\"三\",\"age\":10}";
    JsonFactory jsonFactory = new JsonFactory();
    JsonParser jsonParser = jsonFactory.createParser(json);

    while (!jsonParser.isClosed()) {
      JsonToken jsonToken = jsonParser.nextToken();
      if (JsonToken.FIELD_NAME.equals(jsonToken)) {
        String fieldName = jsonParser.getCurrentName();
        jsonParser.nextToken();
        System.out.println(fieldName + ":" + jsonParser.getValueAsString());
      }
    }
  }
}
