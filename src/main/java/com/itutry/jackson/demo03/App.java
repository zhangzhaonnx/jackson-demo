package com.itutry.jackson.demo03;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

/**
 * ​读JSON到List
 *
 * @author itutry
 * @create 2020-05-21_21:50
 */
public class App {

  public static void main(String[] args) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();
    String json = "[{\"firstName\":\"张\",\"lastName\":\"三\"},{\"firstName\":\"李\",\"lastName\":\"四\"}]";

    List<Person> peopleList = objectMapper.readValue(json, new TypeReference<List<Person>>() {});
    System.out.println(peopleList);
  }
}
