package com.sagar.departmentregistry.model;

public record Employee(Long id, Long departmentId, String name, int age, String position) {

}
