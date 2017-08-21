package com.myApp.converters

import grails.databinding.converters.ValueConverter

class AddressValueConverter implements ValueConverter {

    boolean canConvert(value) {
        value instanceof String
    }

    def convert(value) {
        def pieces = value.split(':')
        new com.myApp.Address(city: pieces[0], state: pieces[1])
    }

    Class<?> getTargetType() {
        com.myApp.Address
    }
}
