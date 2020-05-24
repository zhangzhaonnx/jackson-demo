package com.itutry.jackson.demo09;

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
public class Person {

  private String firstName;
  private String lastName;
  private Address address;
}
