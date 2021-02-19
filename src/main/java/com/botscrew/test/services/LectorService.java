package com.botscrew.test.services;

import com.botscrew.test.models.Lector;
import com.botscrew.test.repositories.LectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LectorService {

    @Autowired
    private LectorRepository lectorRepository;

    public List<Lector> findLectorByName(String name) {
        List<Lector> lectors = lectorRepository.findLectorByName(name);
        for (Lector lector : lectors) {
            System.out.println(lector.getName());
        }
        return lectorRepository.findLectorByName(name);
    }

    public List<Lector> findAvgSalaryLectorByDepartament(String name) {
        int count = 0;
        int sum = 0;

        List<Lector> lectors= lectorRepository.findAvgSalaryLectorByDepartament(name);
        for (Lector lector : lectors) {
            sum +=lector.getSalary();
            count++;
        }
        double avg =sum/count;
        System.out.println("AVG = " + avg);
        return lectorRepository.findAvgSalaryLectorByDepartament(name);
    }

    public List<Lector> findCountOfLectors(String name) {
        int count = 0;
        List<Lector> lectors= lectorRepository.findAvgSalaryLectorByDepartament(name);
        for (Lector lector : lectors) {
            count++;
        }
        System.out.println("Lectors : " + count);
        return lectorRepository.findCountOfLectors(name);
    }
}
