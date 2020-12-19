package com.rodrigo.springproject.entrypoints.controllers;

import com.rodrigo.springproject.entities.DataInfo;
import com.rodrigo.springproject.usecases.GetDataInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/info")
@RequiredArgsConstructor
public class DataInfoController {

    private final GetDataInfo getDataInfo;

    @GetMapping
    public List<DataInfo> getDataInfo() {
        return getDataInfo.execute();
    }

}
