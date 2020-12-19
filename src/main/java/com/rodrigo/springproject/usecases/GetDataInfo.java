package com.rodrigo.springproject.usecases;

import com.rodrigo.springproject.entities.DataInfo;
import com.rodrigo.springproject.gateways.DataInfoGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GetDataInfo {

    private final DataInfoGateway dataInfoGateway;

    public List<DataInfo> execute() {
        return dataInfoGateway.getAllDataInfo();
    }

}
