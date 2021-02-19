package com.botscrew.test.controllers;

import com.botscrew.test.models.Lector;
import com.botscrew.test.services.LectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/lector")
public class LectorController {

    @Autowired
    private LectorService lectorService;

    @GetMapping("/list/{name}")
    public List<Lector> findLectorByName(@PathVariable String name) {
        return lectorService.findLectorByName(name);
    }

    @GetMapping("/agv/{name}")
    public List<Lector> findAvgSalaryLectorByDepartament(@PathVariable String name) {
        return lectorService.findAvgSalaryLectorByDepartament(name);
    }

    @GetMapping("/count/{name}")
    public List<Lector> findCountOfName(@PathVariable String name) {
        return lectorService.findCountOfLectors(name);
    }
}
