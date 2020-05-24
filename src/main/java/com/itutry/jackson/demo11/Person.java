package com.itutry.jackson.demo11;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
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
public class Person {

  @JsonProperty("first")
  private String firstName;
  private String lastName;
  private Date birthday;

  @JsonGetter("age")
  public Date getBirthday() {
    return birthday;
  }

  @JsonSetter("age")
  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }
}
