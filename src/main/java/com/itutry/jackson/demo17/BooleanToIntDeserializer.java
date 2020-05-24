package com.itutry.jackson.demo17;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;

/**
 * @author itutry
 * @create 2020-05-22_09:47
 */
public class BooleanToIntDeserializer extends StdDeserializer<Boolean> {

  protected BooleanToIntDeserializer() {
    super(Boolean.class);
  }

  @Override
  public Boolean deserialize(JsonParser p, DeserializationContext ctxt)
      throws IOException, JsonProcessingException {
    String val = p.getText();
    if ("0".equals(val)) {
      return Boolean.FALSE;
    }
    return Boolean.TRUE;
  }
}
