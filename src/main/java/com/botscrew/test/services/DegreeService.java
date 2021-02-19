package com.botscrew.test.services;

import com.botscrew.test.repositories.DegreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DegreeService {

    @Autowired
    private DegreeRepository degreeRepository;

//    public List<Degree> findAllByDepartament(String name) {
//        List<Degree> degrees = degreeRepository.findAllByDepartament(name);
//        for (Degree degree : degrees) {
//
//        }
//    }
}
