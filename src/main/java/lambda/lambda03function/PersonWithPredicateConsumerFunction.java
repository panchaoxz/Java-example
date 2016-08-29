package lambda.lambda03function;

import entity.Person;
import entity.PersonFactory;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Administrator on 2016/8/21.
 */
public class PersonWithPredicateConsumerFunction {
    public static void processPersonsWithFunction(
            List<Person> roster,
            Predicate<Person> tester,
            Function<Person, String> mapper,
            Consumer<String> block) {
        for (Person p : roster) {
            if (tester.test(p)) {
                String data = mapper.apply(p);
                block.accept(data);
            }
        }
    }
    public static <X, Y> void processElements(
            Iterable<X> source,
            Predicate<X> tester,
            Function <X, Y> mapper,
            Consumer<Y> block) {
        for (X p : source) {
            if (tester.test(p)) {
                Y data = mapper.apply(p);
                block.accept(data);
            }
        }
    }

    public static void main(String[] args) {
        List<Person> list = PersonFactory.getPerson();
        processPersonsWithFunction(
                list,
                p -> p.getGender() == Person.Sex.MALE
                        && p.getAge() >= 10
                        && p.getAge() <= 35,
                p -> p.getEmailAddress(),
                email -> System.out.println(email)
        );
        processElements(
                list,
                p -> p.getGender() == Person.Sex.MALE
                        && p.getAge() >= 10
                        && p.getAge() <= 35,
                p -> p.getEmailAddress(),
                email -> System.out.println(email)
        );
    }
}
