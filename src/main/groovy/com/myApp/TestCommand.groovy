package com.myApp

import grails.validation.Validateable


class TestCommand implements Serializable, Validateable {

    String name
    BigDecimal decimalNumber

    static constraints = {
        name nullable:true
        decimalNumber nullable:true
    }

}
