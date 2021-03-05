package br.com.erudio.services;

import br.com.erudio.model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    public Person findById(String id) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Cleiton");
        person.setLastName("Freitas");
        person.setAddress("Nova Mutum - Mato Grosso - Brasil");
        person.setGender("Male");
        return person;
    }

}
