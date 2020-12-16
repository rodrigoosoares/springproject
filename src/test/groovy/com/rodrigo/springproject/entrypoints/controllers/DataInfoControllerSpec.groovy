package com.rodrigo.springproject.entrypoints.controllers

import spock.lang.Specification

class DataInfoControllerSpec extends Specification {

    DataInfoController dataInfoController = new DataInfoController()


    def "test"() {
        when: "execute controller"
        def result = dataInfoController.getDataInfo()

        then: "should be oi"
        result ==  "oi"
    }

}
