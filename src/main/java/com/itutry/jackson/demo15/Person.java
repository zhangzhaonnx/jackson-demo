package com.itutry.jackson.demo15;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * @author itutry
 * @create 2020-05-21_21:17
 */
@ToString
@Getter
public class Person {

  private final String firstName;
  private final String lastName;

  @JsonCreator
  public Person(@JsonProperty("firstName") String firstName, @JsonProperty("lastName")String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
}
