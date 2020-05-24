package com.itutry.jackson.demo09;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @ JsonIgnoreType：放在被忽略字段的类上
 *
 *
 * @author itutry
 * @create 2020-05-21_22:40
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
    Address address = new Address("四川", "成都", "华府大道");

    return new Person("张", "三", address);
  }
}
