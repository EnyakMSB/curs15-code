/*package ro.fasttrackit.curs15.Exercitiu2TDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.List;

public class PersonServiceTest {
    PersonService personService;

    @BeforeEach
    void setup() {
        personService = new PersonService(List.of(
                new Person(1, "Sandu", 66),
                new Person(2, "Viorel", 41),
                new Person(3, "Radu", 18)
        ));
    }


    @Test
    @DisplayName("get person older than -> OK")
    void getPersonsOlderThan() {
        assertThat(personService.getPersonsOlderThan(55)).isEqualTo(List.of(
                new Person(1, "Sandu", 66)
                ));
        assertThat(personService.getPersonsOlderThan(25)).isEqualTo(List.of(
                new Person(1, "Sandu", 66),
                new Person(2, "Viorel", 41)
                ));
        assertThat(personService.getPersonsOlderThan(121)).isEqualTo(List.of());

    }

    @Test
    @DisplayName("get all persons names -> OK")
    void getAllPersonNames() {
        assertThat(personService.getAllPersonNames()).isEqualTo(List.of("Sandu", "Viorel", "Radu"));
    }

    @Test
    @DisplayName("get persons by name -> OK")
 void getPersonByName() {
        assertThat(personService.getPersonByName("Sandu")).isEqualTo(List.of(new Person(1, "Sandu", 66)));
        assertThat(personService.getPersonByName("Hagi")).isEqualTo(List.of());
        assertThat(personService.getPersonByName("")).isEqualTo(List.of());
    }

    @Test
    @DisplayName("get persons by id -> OK")
    void getPersonById() {
        assertThat(personService.getPersonById(1)).isEqualTo(List.of(new Person(1, "Sandu", 66)));
        assertThat(personService.getPersonById(7)).isEqualTo(List.of());
        assertThat(personService.getPersonById(-1)).isEqualTo(List.of());
    }
}

*/