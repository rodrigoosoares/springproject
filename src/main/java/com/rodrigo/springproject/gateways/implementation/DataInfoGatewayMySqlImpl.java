package com.rodrigo.springproject.gateways.implementation;

import com.rodrigo.springproject.entities.DataInfo;
import com.rodrigo.springproject.gateways.DataInfoGateway;
import com.rodrigo.springproject.gateways.repositories.mysql.DataInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DataInfoGatewayMySqlImpl implements DataInfoGateway {

    private final DataInfoRepository dataInfoRepository;

    @Override
    public List<DataInfo> getAllDataInfo() {
        return dataInfoRepository.getAllDataInfo();
    }
}
