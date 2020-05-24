package com.itutry.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

/**
 * Jackson根据xsd生成Java
 * 1.创建xsd文件
 * 2.pom.xml中加build插件并配置：org.apache.cxf:cxf-xjc-plugin
 * 3.生成代码：mvn install
 *
 * @author itutry
 * @create 2020-05-24_15:47
 */
public class App {

  public static void main(String[] args) throws IOException {
    ObjectMapper objectMapper = new ObjectMapper();

    String json = objectMapper.writeValueAsString(getPerson());
    System.out.println(json);

    Person person = objectMapper.readValue(json, Person.class);
    System.out.println(person);
  }

  private static Person getPerson() {
    Person person = new Person();
    person.setFirstName("张");
    person.setLastName("三");
    return person;
  }
}
