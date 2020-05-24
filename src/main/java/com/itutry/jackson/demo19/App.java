package com.itutry.jackson.demo19;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * 用来访问JSON树
 *
 * @author itutry
 * @create 2020-05-22_13:32
 */
public class App {

  public static void main(String[] args) throws JsonProcessingException {
    String json = "{\"firstName\":\"张\",\"lastName\":\"三\",\"age\":18}";

    ObjectMapper objectMapper = new ObjectMapper();
    // 将JSON解析成JsonNode组成的树结构
    JsonNode rootNode = objectMapper.readTree(json);

    // 根据字段名获取子节点
    JsonNode firstNameNode = rootNode.get("firstName");
    // 获取String类型节点值
    String firstName = firstNameNode.asText();
    System.out.println(firstName);

    JsonNode ageNode = rootNode.get("age");
    // 获取int类型节点值
    int age = ageNode.asInt();
    System.out.println(age);

    // 创建新节点
    ObjectNode newNode = objectMapper.createObjectNode();
    // 用给定节点的属性，覆盖本节点
    newNode.setAll((ObjectNode) rootNode);
    // 给节点添加属性
    newNode.put("hometown", "baiyin");
    // jsonNode转成json
    String newJson = objectMapper.writeValueAsString(newNode);
    System.out.println(newJson);
  }
}
