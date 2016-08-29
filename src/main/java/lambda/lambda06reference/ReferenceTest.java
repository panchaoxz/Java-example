package lambda.lambda06reference;

import entity.Person;
import entity.PersonFactory;

import java.util.*;
import java.util.function.Supplier;

/**
 * Created by Administrator on 2016/8/22.
 */
public class ReferenceTest {

    public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>>
    DEST transferElements(
            SOURCE sourceCollection,
            Supplier<DEST> collectionFactory) {

        DEST result = collectionFactory.get();
        for (T t : sourceCollection) {
            result.add(t);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Person> list = PersonFactory.getPerson();
        Person[] personArray = list.toArray(new Person[list.size()]);
        Arrays.stream(personArray).forEach(System.out::println);
        ComparisonProvider myComparisonProvider = new ComparisonProvider();
        Arrays.sort(personArray, myComparisonProvider::compareByName);
        Arrays.stream(personArray).forEach(System.out::println);


        String[] stringArray = {"Barbara", "James", "Mary", "John",
                "Patricia", "Robert", "Michael", "Linda"};
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        Arrays.stream(stringArray).forEach(System.out::println);

        Set<Person> rosterSet = transferElements(list, HashSet<Person>::new);
        rosterSet.forEach(System.out::println);
    }
}

class ComparisonProvider {
    public int compareByName(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }

    public int compareByAge(Person a, Person b) {
        return a.getBirthday().compareTo(b.getBirthday());
    }
}

