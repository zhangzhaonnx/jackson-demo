package com.itutry.jackson.demo01;

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
public class Address {

  private String state;
  private String city;
  private String street;
}
