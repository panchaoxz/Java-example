package entity;

import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by Administrator on 2016/8/21.
 */
public class Person {
    public enum Sex {
        MALE, FEMALE
    }

    private String name;
    private Date birthday;
    private Sex gender;
    private String emailAddress;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                ", age=" + age +
                '}';
    }

    public void printPerson() {
        System.out.println(this.toString());
    }

    public static int compareByName(Person a, Person b) {
        return a.name.compareTo(b.name);
    }
}
