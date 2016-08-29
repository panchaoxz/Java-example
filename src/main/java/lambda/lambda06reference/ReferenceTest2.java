package lambda.lambda06reference;

import entity.Person;
import entity.PersonFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by Administrator on 2016/8/23.
 */
public class ReferenceTest2 {
    public static ArrayList<Person> transform(ArrayList<Person> list1, Supplier<List<Person>> personList) {
        ArrayList<Person> list = (ArrayList<Person>) personList.get();
        for (Person p : list1) {
            list.add(p);
        }
        return list;
    }

    public static void consumerLambda (Consumer<String> c){
    }

    public static void testConsmer(String args){
        System.out.println(args);
    }

    public static void main(String[] args) {
        List<Person> list = PersonFactory.getPerson();
        ArrayList<Person> personList = transform((ArrayList<Person>) list, ArrayList<Person>::new);
    }
}
