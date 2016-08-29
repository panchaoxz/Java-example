package lambda.lambda02consumer;

import entity.Person;
import entity.PersonFactory;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by Administrator on 2016/8/21.
 */
public class PersonWithPredicateConsumer {
    public static void processPersons(
            List<Person> roster,
            Predicate<Person> tester,
            Consumer<Person> block) {
        for (Person p : roster) {
            if (tester.test(p)) {
                block.accept(p);
            }
        }
    }

    public static void main(String[] args) {
        List<Person> list = PersonFactory.getPerson();
        processPersons(
                list,
                p -> p.getGender() == Person.Sex.MALE
                        && p.getAge() >= 8
                        && p.getAge() <= 65,
                p -> p.printPerson()
        );
    }
}
