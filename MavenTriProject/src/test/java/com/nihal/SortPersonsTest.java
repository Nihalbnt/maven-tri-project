package com.nihal;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SortPersonsTest {

    @Test
    public void testPersonSorting() {
        // Initialisation de la liste de personnes
        List<Person> people = new ArrayList<>();
        people.add(new Person("Hamid", "Jamila"));
        people.add(new Person("Martin", "Bob"));
        people.add(new Person("Hamid", "Charles"));
        people.add(new Person("Bernard", "Jamila"));
        

        // Tri de la liste
        Collections.sort(people);

        // Liste attendue
        List<Person> expected = new ArrayList<>();
        expected.add(new Person("Bernard", "Jamila"));
        expected.add(new Person("Hamid", "Charles"));
        expected.add(new Person("Hamid", "Jamila"));
        expected.add(new Person("Martin", "Bob"));

        // Vérification
        assertEquals("La liste triée n'est pas conforme à l'attendu.", expected, people);
    }
}
