package com.rodrigo.springproject.gateways.repositories.mysql;

import com.rodrigo.springproject.entities.DataInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DataInfoRepository {

    public List<DataInfo> getAllDataInfo() {
        return List.of(
                new DataInfo(1L, "Data info 1"),
                new DataInfo(2L, "Data info 2"),
                new DataInfo(3L, "Data info 3")
        );
    }

}
