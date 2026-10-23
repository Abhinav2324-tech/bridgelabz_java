package com.bridgelabz.java_json;
public class Validate {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        String json = "{\"name\":\"Rahul\",\"age\":21}";

        try {
            JsonNode node = mapper.readTree(json);

            System.out.println("Valid JSON");

        } catch (Exception e) {
            System.out.println("Invalid JSON");
        }
    }
}
