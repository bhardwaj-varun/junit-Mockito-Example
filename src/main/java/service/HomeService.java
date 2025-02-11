package service;

import model.Person;

import java.util.ArrayList;
import java.util.List;

public class HomeService {

    List<Person> persons;

    public HomeService() {
        persons = new ArrayList<>();
        persons.add(new Person("1", "John Doe"));
        persons.add(new Person("2", "Jane Tyler"));
    }
    public HomeService(List<Person> persons) {
        this.persons = persons;
    }
    public List<Person> getAll() {
        return this.persons;
    }

    public Person getById(String id) {
        return persons.stream().filter(person -> person.getId().equals(id)).findFirst().orElse(null);
    }
}
