package com.bridgelabz.java_json;
public class Main {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        ObjectNode obj1 = mapper.createObjectNode();
        obj1.put("name", "Rahul");
        obj1.put("age", 21);

        ObjectNode obj2 = mapper.createObjectNode();
        obj2.put("department", "CSE");
        obj2.put("marks", 95);

        obj1.setAll(obj2);

        System.out.println(
                mapper.writerWithDefaultPrettyPrinter()
                        .writeValueAsString(obj1)
        );
    }
}