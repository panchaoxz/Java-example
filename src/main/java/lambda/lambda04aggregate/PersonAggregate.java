package lambda.lambda04aggregate;

import entity.Person;
import entity.PersonFactory;

import java.util.List;

/**
 * Created by Administrator on 2016/8/21.
 */
public class PersonAggregate {
    public static void main(String[] args) {
        List<Person> list = PersonFactory.getPerson();
        list.stream().filter(
                p -> p.getGender() == Person.Sex.MALE
                        && p.getAge() >= 18
                        && p.getAge() <= 25)
                .map(p -> p.getEmailAddress())
                .forEach(email -> System.out.println(email));
    }
}
