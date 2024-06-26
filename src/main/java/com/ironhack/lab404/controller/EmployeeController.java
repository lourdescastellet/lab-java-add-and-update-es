package com.ironhack.lab404.controller;


import com.ironhack.lab404.dtos.EmployeeRequest;
import com.ironhack.lab404.dtos.EmployeeUpdateRequest;
import com.ironhack.lab404.model.Employee;
import com.ironhack.lab404.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/id/{employeeId}")
    @ResponseStatus(HttpStatus.OK)
    public Employee getEmployeeById(@PathVariable Integer employeeId){
        return employeeService.getEmployeeById(employeeId);
    }

    @GetMapping("/status/{status}")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getByStatus(@PathVariable String status){
        return employeeService.getByStatus(status);
    }

    @GetMapping("/department/{department}")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getByDepartment(@PathVariable String department){
        return employeeService.getByDepartment(department);
    }

    // 2. Añadir un nuevo doctor
    @PostMapping("/newEmployee")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee createEmployee(@Valid @RequestBody EmployeeRequest employeeRequest){
        return employeeService.createEmployee(employeeRequest);
    }

    // 3. Cambiar el estado del doctor
    // 4. Actualizar el departamento del doctor
    @PutMapping("{employeeId}/updateEmployee")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateEmployee(@PathVariable Integer employeeId,
                               @RequestBody EmployeeUpdateRequest employeeUpdateRequest){
        employeeService.updateEmployee(employeeId, employeeUpdateRequest);
    }


}
