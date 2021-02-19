package com.botscrew.test.services;

import com.botscrew.test.models.Departament;
import com.botscrew.test.models.Lector;
import com.botscrew.test.repositories.DepartamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentService {

    @Autowired
    private DepartamentRepository departamentRepository;

    public Departament findHeadDepartamentByName(String name){
        Departament departament = departamentRepository.findHeadDepartamentByName(name);
        System.out.println("Head of " + departament.getName() + " department is " +departament.getHead());
        return departament;
    }

//    public List<Lector> findDepartamentStatistic(String name){
//
//    }

}
