package com.itutry.jackson.demo17;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

/**
 * @author itutry
 * @create 2020-05-22_09:45
 */
public class BooleanToIntSerializer extends StdSerializer<Boolean> {

  protected BooleanToIntSerializer() {
    super(Boolean.class);
  }

  @Override
  public void serialize(Boolean value, JsonGenerator gen, SerializerProvider provider)
      throws IOException {
    if (value) {
      gen.writeNumber(1);
    } else {
      gen.writeNumber(0);
    }
  }
}
