package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/8/21.
 */
public class PersonFactory {
    public static List<Person> getPerson() {
        List<Person> list = new ArrayList();

        Person p1 = new Person();
        p1.setBirthday(new Date(new Date().getTime()+100000));
        p1.setGender(Person.Sex.FEMALE);
        p1.setName("p1");
        p1.setEmailAddress("p1@p1.com");
        p1.setAge(20);
        list.add(p1);

        Person p2 = new Person();
        p2.setBirthday(new Date(new Date().getTime()+200000));
        p2.setGender(Person.Sex.MALE);
        p2.setName("p2");
        p2.setEmailAddress("p2@p2.com");
        p2.setAge(25);
        list.add(p2);

        Person p3 = new Person();
        p3.setAge(60);
        p3.setBirthday(new Date(new Date().getTime()+500000));
        p3.setName("P3");
        p3.setEmailAddress("p3@p3.com");
        p3.setGender(Person.Sex.FEMALE);
        list.add(p3);

        Person p4 = new Person();
        p4.setEmailAddress("p4@p4.com");
        p4.setGender(Person.Sex.MALE);
        p4.setName("P4");
        p4.setBirthday(new Date(new Date().getTime()+400000));
        p4.setAge(18);
        list.add(p4);
        return list;
    }
}
