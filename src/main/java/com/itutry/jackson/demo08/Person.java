package com.itutry.jackson.demo08;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
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
@JsonIgnoreProperties({"birthday"})
public class Person {

  private String firstName;
  private String lastName;
  private Date birthday;
}
