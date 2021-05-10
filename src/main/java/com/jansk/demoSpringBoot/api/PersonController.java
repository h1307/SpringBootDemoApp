package com.jansk.demoSpringBoot.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.ArrayList;

@RestController
public class PersonController {

    @GetMapping
    public ArrayList<String> getPersons()
    {
        ArrayList<String> persons = new ArrayList<String>();
        persons.add("debil");
        persons.add("blbeček");
        return persons;
    }
}
