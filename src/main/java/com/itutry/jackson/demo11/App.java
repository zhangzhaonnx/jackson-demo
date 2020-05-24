package com.itutry.jackson.demo11;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Date;

/**
 * ​​​修改字段名
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
    return new Person("张", "三", new Date());
  }
}
