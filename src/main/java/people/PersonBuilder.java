package people;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("This age is incorrect");
        this.age = age;
        return this;
    }
    public PersonBuilder setAddress(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (name == null || surname == null)
            throw new IllegalStateException("Person can't be created without name or surname!");
        return new Person(name, surname, age, city);
    }

}
