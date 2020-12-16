package com.rodrigo.springproject.entrypoints.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class DataInfoController {

    @GetMapping
    public String getDataInfo() {
        return "oi";
    }

}
