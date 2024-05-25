package com.sagar.departmentregistry.client;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import com.sagar.departmentregistry.model.Employee;

@HttpExchange
public interface EmployeeClient {
    
        @GetExchange("/employee/department/{departmentId}")
        public List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId);
    
}
