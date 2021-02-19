package com.botscrew.test.controllers;

import com.botscrew.test.models.Departament;
import com.botscrew.test.services.DepartamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/departament")
public class DepartamentController {

    @Autowired
    private DepartamentService departamentService;

    @RequestMapping("/{name}")
    public Departament getHeadDepartamentByName(@PathVariable String name) {
        return departamentService.findHeadDepartamentByName(name);
    }

}
