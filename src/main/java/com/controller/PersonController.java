package com.controller;

import com.entity.Person;
import com.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(value = "/api/personContacts", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    public @ResponseBody Iterable<Person> getAllPersons() {
        return personRepository.findByOrderByNameAsc();
    }

}
