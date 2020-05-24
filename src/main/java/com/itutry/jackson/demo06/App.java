package com.itutry.jackson.demo06;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * ​忽略未知字段
 *
 * @author itutry
 * @create 2020-05-21_22:11
 */
public class App {

  public static void main(String[] args) throws JsonProcessingException {
//    beforeConfig();
    afterConfig();
  }

  private static void afterConfig() throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    String json = "{\"firstName\":\"张\",\"lastName\":\"三\",\"birthday\":\"2020-05-21 22:18:23\"}";

    Person person = objectMapper.readValue(json, Person.class);
    System.out.println(person);
  }

  private static void beforeConfig() throws JsonProcessingException {
    // UnrecognizedPropertyException: Unrecognized field "birthday"
    ObjectMapper objectMapper = new ObjectMapper();

    String json = "{\"firstName\":\"张\",\"lastName\":\"三\",\"birthday\":\"2020-05-21 22:18:23\"}";

    Person person = objectMapper.readValue(json, Person.class);
    System.out.println(person);
  }
}
