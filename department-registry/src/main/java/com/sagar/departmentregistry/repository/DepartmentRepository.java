package com.sagar.departmentregistry.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sagar.departmentregistry.model.Department;

@Repository
public class DepartmentRepository {

    public List<Department> departments = new ArrayList<>();

    public Department addDepartment(Department department) {
        departments.add(department);
        return department;
    }

    public List<Department> findAll() {
        return departments;
    }

    public Department findById(Long id) {
        return departments.stream().filter(department -> department.getId().equals(id)).findFirst().orElseThrow();
    }

}
