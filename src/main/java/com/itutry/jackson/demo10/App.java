package com.itutry.jackson.demo10;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @ JsonInclude(Include.NON_EMPTY)：​忽略null和空容器
 *
 * @author itutry
 * @create 2020-05-21_21:50
 */
public class App {

  public static void main(String[] args) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();

    String json = objectMapper.writeValueAsString(getPerson());
    System.out.println(json);
  }

  private static Person getPerson() {
    return new Person("张", null);
  }
}
