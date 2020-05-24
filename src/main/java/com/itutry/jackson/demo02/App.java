package com.itutry.jackson.demo02;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;

/**
 * ​读JSON到Array
 *
 * @author itutry
 * @create 2020-05-21_21:50
 */
public class App {

  public static void main(String[] args) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();
    String json = "[{\"firstName\":\"张\",\"lastName\":\"三\"},{\"firstName\":\"李\",\"lastName\":\"四\"}]";
    Person[] peopleArray = objectMapper.readValue(json, Person[].class);
    System.out.println(Arrays.toString(peopleArray));
  }
}
