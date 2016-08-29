package lambda.lambda01Predicate;

import entity.Person;
import entity.PersonFactory;

import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Administrator on 2016/8/21.
 */
public class PersonsWithPredicate {
    public void printPersonsWithPredicate(List<Person> roster, Predicate<Person> tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    public static void main(String[] args) {
        PersonsWithPredicate predicate = new PersonsWithPredicate();
        List<Person> list = PersonFactory.getPerson();
        predicate.printPersonsWithPredicate(list, p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 10);
    }
}
