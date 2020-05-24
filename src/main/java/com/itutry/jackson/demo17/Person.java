package com.itutry.jackson.demo17;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
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
  @JsonSerialize(using = BooleanToIntSerializer.class)
  @JsonDeserialize(using = BooleanToIntDeserializer.class)
  private Boolean isMale;
}
