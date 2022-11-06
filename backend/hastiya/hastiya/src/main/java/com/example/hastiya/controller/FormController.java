package com.example.hastiya.controller;

import com.example.hastiya.dto.FormDto;
import com.example.hastiya.service.FormService;
import com.example.hastiya.util.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/form")
public class FormController {
    private FormService formService;

    @Autowired
    public FormController(FormService formService) {
        this.formService = formService;
    }

    @PostMapping("/")
    public CommonResponse saveEmployee(@RequestBody FormDto formDto){
        return formService.saveEmployee(formDto);
    }
}
