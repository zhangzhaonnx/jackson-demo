package com.itutry.jackson.demo04;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;

/**
 * ​读JSON到List
 *
 * @author itutry
 * @create 2020-05-21_21:50
 */
public class App {

  public static void main(String[] args) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();
    String json = "{\"firstName\":\"张\",\"lastName\":\"三\"}";

    Map<String, String> map =
        objectMapper.readValue(json, new TypeReference<Map<String, String>>() {});
    System.out.println(map);
  }
}
