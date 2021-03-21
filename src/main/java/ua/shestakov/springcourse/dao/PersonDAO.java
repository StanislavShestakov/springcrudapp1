package ua.shestakov.springcourse.dao;

import org.springframework.stereotype.Component;
import ua.shestakov.springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;


@Component
public class PersonDAO {

    private static  int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT,"Tom"));
        people.add(new Person(++PEOPLE_COUNT,"Bob"));
        people.add(new Person(++PEOPLE_COUNT,"Pups"));
        people.add(new Person(++PEOPLE_COUNT,"Jimmy"));
    }

    public List<Person> index(){
        return people;
    }

    public Person show(int id){
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
