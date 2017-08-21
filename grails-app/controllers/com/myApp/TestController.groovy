package com.myApp

import grails.web.databinding.DataBindingUtils
import valueconvertertest.Persona

class TestController {

    def index() {
        try {
            def bindingMap = [name: "Test", decimalNumber: '22,25']
            def command = new TestCommand()
            DataBindingUtils.bindObjectToInstance(command, bindingMap)
//        command.properties = bindingMap
            println(command.name)
            println(command.decimalNumber)
        } catch (e) {}

        def bind = [firstName: "FN", lastName: "LN", age: '552,25']
        def person = new Persona()
        person.properties = bind
        println(person.firstName)
        println(person.lastName)
        println(person.age)
        def bindNew = [age: '2542,33.77']
        person.properties = bindNew
        println(person.firstName)
        println(person.lastName)
        println(person.age)
    }
}
