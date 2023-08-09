package com.foodrecommend.commons.validators;

public interface Validator<T> {
    void check(T t);
}