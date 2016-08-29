package lambda.lambda05comparator;

import entity.Person;
import entity.PersonFactory;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/8/21.
 */
public class PersonComparator {
    public static void main(String[] args) {
        List<Person> list = PersonFactory.getPerson();
        Person[] personArray = list.toArray(new Person[list.size()]);
        Arrays.stream(personArray).forEach(System.out::println);
        // way one
        Arrays.sort(personArray,
                (Person a, Person b) -> {
                    return a.getName().compareTo(b.getName());
                }
        );

        // way two
        Arrays.sort(personArray,
                (a, b) -> Person.compareByName(a, b)
        );

        Arrays.stream(personArray).forEach(System.out::println);
    }
}
