package com.example.naumenwebproject.service;



import com.example.naumenwebproject.model.Person;
import com.example.naumenwebproject.repository.PeopleRepositories;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private final PeopleRepositories peopleRepositories;

    public PersonService(PeopleRepositories peopleRepositories) {
        this.peopleRepositories = peopleRepositories;
    }

    /*public String getUsername() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        PersonDetails userDetails = (PersonDetails) authentication.getPrincipal();

        return userDetails.getUsername();
    }*/
}
