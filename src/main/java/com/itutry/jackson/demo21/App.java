package com.itutry.jackson.demo21;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.File;
import java.io.IOException;

/**
 * JsonGenerator使用
 *
 * @author itutry
 * @create 2020-05-24_15:03
 */
public class App {

  public static void main(String[] args) throws IOException {
    JsonFactory jsonFactory = new JsonFactory();
    File file = new File("person.json");
    JsonGenerator jsonGenerator = jsonFactory.createGenerator(file, JsonEncoding.UTF8);

    jsonGenerator.writeStartObject();
    jsonGenerator.writeStringField("firstName", "张");
    jsonGenerator.writeStringField("lastName", "三");
    jsonGenerator.writeNumberField("age", 18);
    jsonGenerator.writeEndObject();
    jsonGenerator.close();
  }
}
