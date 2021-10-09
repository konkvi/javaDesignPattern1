package people;

import java.util.Objects;

public class Person {
    private final String name;
    private final String surname;
    private int age;
    private String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return city;
    }

    public boolean hasAge() {
        return getAge() == 0;
    }

    public boolean hasAddress() {
        return getAddress() == null;
    }

    public void setAddress(String city) {
        this.city = city;
    }

    //Если возраст человека известен, то с момента создания объекта он может быть изменён
    //только увеличением на единицу через вызов метода happyBirthday()
    public void happyBirthday() {
        age++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(surname + " ");
        sb.append(name + " [ ");
        sb.append(age + " лет, из ");
        sb.append(city + " ]");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    //метод для получения полузаполненного билдера для ребёнка в класс Person
    //с уже заполненными фамилией (родительской), возрастом и текущим городом жительства (родительским)
    public PersonBuilder newChildBuilder() {
        PersonBuilder builder = new PersonBuilder();
        return builder.setAddress(this.city).setAge(0).setSurname(this.surname);
    }
}
