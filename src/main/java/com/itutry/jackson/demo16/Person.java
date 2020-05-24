package com.itutry.jackson.demo16;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.HashMap;
import java.util.Map;
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

  private Map<String, Object> properties = new HashMap<>();

  @JsonAnyGetter
  public Map<String, Object> getProperties() {
    return properties;
  }

  @JsonAnySetter
  public void set(String key, Object value) {
    properties.put(key, value);
  }
}
