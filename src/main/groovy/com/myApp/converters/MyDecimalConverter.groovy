package com.myApp.converters

import grails.databinding.converters.ValueConverter

import java.text.NumberFormat

class MyDecimalConverter implements ValueConverter {
    @Override
    boolean canConvert(Object value) {
        value instanceof String
    }

    @Override
    Object convert(Object value) {
        def numberFormatter = NumberFormat.getInstance(Locale.GERMAN)
        numberFormatter.parse((String)value).asType(getTargetType())
    }

    @Override
    Class<?> getTargetType() {
        BigDecimal
    }
}
