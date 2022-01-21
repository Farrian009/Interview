package HW_Les1;

public class Person {
    public static void main(String[] args) {
        Person person = new BuildPerson.PersonBuilder("ALex", "Big", "junior", "1 street", 25, "male").setPhone("+7999000").build();
    }
}

    class BuildPerson {
        private String firstName;
        private String lastName;
        private String middleName;
        private String country;
        private String address;
        private String phone;
        private int age;
        private String gender;



    private BuildPerson(PersonBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.middleName = builder.middleName;
        this.country = builder.country;
        this.address = builder.address;
        this.phone = builder.phone;
        this.age = builder.age;
        this.gender = builder.gender;
    }

    static class PersonBuilder {
        private String firstName;
        private String lastName;
        private String middleName;
        private String country;
        private String address;
        private String phone;
        private int age;
        private String gender;

        public PersonBuilder(String firstName, String lastName,
                             String middleName, String address,
                             int age, String gender) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.middleName = middleName;
            this.address = address;
            this.age = age;
            this.gender = gender;
        }

        public PersonBuilder PersonBuilder(String country) {
            this.country = country;
            return this;
        }

        public PersonBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

}
