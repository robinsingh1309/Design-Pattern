package Creational.Builder.com.example.user;


public class User {

    // Fields

    private String name;
    private int age;
    private String email;


    // Constructors
    // --------------------------------------------------------
    private User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }


    // Getters
    // --------------------------------------------------------
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }


    // Inner class

    public static class UserBuilder {

        // Inner Class Fields

        private String name;
        private int age;
        private String email;


        // Inner Class Setters
        // --------------------------------------------------------

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }


        // Inner Class Methods
        // --------------------------------------------------------

        public User build() {
            return new User(this);
        }

    }


    // Object Methods
    // --------------------------------------------------------

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + ", email=" + email + "]";
    }


}
