package com.itutry.jackson.demo15;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * ​使用构造器
 *
 * @author itutry
 * @create 2020-05-21_22:11
 */
public class App {

  public static void main(String[] args) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();

    String json = "{\"firstName\":\"张\",\"lastName\":\"三\"}";
    Person person = objectMapper.readValue(json, Person.class);
    System.out.println(person);
  }
}
