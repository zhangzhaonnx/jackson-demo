package com.itutry.jackson.demo12;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author itutry
 * @create 2020-05-21_21:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({"lastName", "firstName"})
public class Person {

  private String firstName;
  private String lastName;
}
