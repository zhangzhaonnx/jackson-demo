package com.itutry.jackson.demo01;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ​1. 对象和JSON字符串互转
 * ​2. 对象和JSON字节数组串互转
 * ​3. 对象和JSON文件互转
 *
 * @author itutry
 * @create 2020-05-21_21:20
 */
public class App {

  public static void main(String[] args) throws IOException {
    object2Json();
    object2Bytes();
    object2File();
  }

  private static void object2File() throws IOException {
    ObjectMapper objectMapper = new ObjectMapper();
    File file = new File("person.json");
    objectMapper.writeValue(file, getPerson());
    Person person = objectMapper.readValue(file, Person.class);
    System.out.println(person);
  }

  private static void object2Json() throws JsonProcessingException {
    // 实例化ObjectMapper
    ObjectMapper objectMapper = new ObjectMapper();

    // 对象转成JSON
    String json = objectMapper.writeValueAsString(getPerson());
    System.out.println(json);

    // JSON转成对象
    Person person = objectMapper.readValue(json, Person.class);
    System.out.println(person);
  }

  private static void object2Bytes() throws IOException {
    ObjectMapper objectMapper = new ObjectMapper();

    byte[] bytes = objectMapper.writeValueAsBytes(getPerson());
    System.out.println(bytes);

    Person person = objectMapper.readValue(bytes, Person.class);
    System.out.println(person);
  }

  private static Person getPerson() {
    List<PhoneNumber> phones = new ArrayList<>();
    phones.add(new PhoneNumber("86", "12812345678"));
    phones.add(new PhoneNumber("86", "15212345678"));

    Address address = new Address("四川", "成都", "华府大道");

    return new Person("张", "三", address, phones);
  }
}
