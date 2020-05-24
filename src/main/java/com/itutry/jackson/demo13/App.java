package com.itutry.jackson.demo13;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * ​​输出JSON字段
 *
 * @author itutry
 * @create 2020-05-21_22:11
 */
public class App {

  public static void main(String[] args) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();

    String json = objectMapper.writeValueAsString(getPerson());
    System.out.println(json);
  }

  private static Person getPerson() {
    return new Person("张", "三", "{\"state\":\"四川\",\"city\":\"成都\",\"street\":\"华府大道\"}");
  }
}
