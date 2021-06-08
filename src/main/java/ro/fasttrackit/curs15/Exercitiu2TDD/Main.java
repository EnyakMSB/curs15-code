package ro.fasttrackit.curs15.Exercitiu2TDD;

import java.util.List;

public class Main {
    public static void main(String[] args) throws IdNotFoundException {
        PersonService persons = new PersonService(List.of(
                new Person(1, "Sandu", 66),
                new Person(2, "Viorel", 41),
                new Person(3, "Radu", 18)
        ));
        System.out.println("Removed Person is: " + persons.removePerson(8) + "\n");
        System.out.println("Removed Person is: " + persons.removePerson(3) + "\n");
        System.out.println("All persons: " + persons.getAllPersons() + "\n");
        System.out.println("Person older than age: " + persons.getPersonsOlderThan(25) + "\n");
        System.out.println("Person names: " + persons.getAllPersonNames() + "\n");
        System.out.println("Found person by id: " + persons.getPersonById(5) + "\n");
        System.out.println("Add new person: " + persons.addPerson("Maria", 55) + "\n");
        System.out.println("Removed Person from list is: " + persons.removePerson(5) + "\n");
    }
}
