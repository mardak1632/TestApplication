package org.metin.test.persontest;

import java.util.ArrayList;
import java.util.List;

public class Person4Test {

    public static void main(String[] args) {
        List<Person4> people = new ArrayList<>();
        //Person4[] people = new Person4[20]; 1000 => person.length yerine geldi
        for (int i = 0; i < 1000; i++) {
            Person4 person = new Person4(NameUtils.randomFirstName(), NameUtils.randomLastName());
            people.add(person);
        }
        for (Person4 person : people) {
            System.out.println("Person's full name: " + person.getFullName());
        }
    }
}
