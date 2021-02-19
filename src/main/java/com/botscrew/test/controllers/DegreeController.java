package com.botscrew.test.controllers;

import com.botscrew.test.services.DegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/degree")
public class DegreeController {

    @Autowired
    private DegreeService degreeService;


}
