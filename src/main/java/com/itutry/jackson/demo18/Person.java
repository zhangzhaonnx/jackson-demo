package com.itutry.jackson.demo18;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author itutry
 * @create 2020-05-21_21:17
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class Person {

  private Integer id;

  @Getter
  @Setter
  private String firstName;

  @Getter
  @Setter
  private String lastName;
}
