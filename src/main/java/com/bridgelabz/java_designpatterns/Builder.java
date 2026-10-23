package com.bridgelabz.java_designpatterns;
class User {

    private String name;
    private int age;
    private String email;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    public void display() {
        System.out.println(name + " " + age + " " + email);
    }

    static class Builder {

        private String name;
        private int age;
        private String email;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

public class Builder {
    public static void main(String[] args) {

        User user = new User.Builder()
                .setName("Rahul")
                .setAge(21)
                .setEmail("rahul@gmail.com")
                .build();

        user.display();
    }
}
