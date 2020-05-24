package com.itutry.jackson.demo18;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *​ ​输出私有字段
 *
 * @author itutry
 * @create 2020-05-21_22:11
 */
public class App {

  public static void main(String[] args) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();

    String json = objectMapper.writeValueAsString(getPerson());
    System.out.println(json);

    Person person = objectMapper.readValue(json, Person.class);
    System.out.println(person);
  }

  private static Person getPerson() {
    return new Person(1, "张", "三");
  }
}
