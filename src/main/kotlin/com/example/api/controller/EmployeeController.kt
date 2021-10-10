package com.example.api.controller

import com.example.api.model.Employee
import com.example.api.practice.resizePane
import com.example.api.service.EmployeeService
import org.springframework.web.bind.annotation.*

/**
 * https://www.expatdev.com/posts/build-rest-api-spring-boot-kotlin/
 * https://github.com/anirban99/spring-boot-examples
 * */
@RestController
class EmployeeController (private val employeeService: EmployeeService) {

    @GetMapping("/employees")
    fun getAllEmployees(): List<Employee> = employeeService.getAllEmployees()

    @GetMapping("/employees/{id}")
    fun getEmployeesById(@PathVariable("id") employeeId: Long): Employee =
        employeeService.getEmployeesById(employeeId)

    @PostMapping("/employees")
    fun createEmployee(@RequestBody payload: Employee): Employee = employeeService.createEmployee(payload)

    @PutMapping("/employees/{id}")
    fun updateEmployeeById(@PathVariable("id") employeeId: Long, @RequestBody payload: Employee): Employee =
        employeeService.updateEmployeeById(employeeId, payload)

    @DeleteMapping("/employees/{id}")
    fun deleteEmployeesById(@PathVariable("id") employeeId: Long): Unit =
        employeeService.deleteEmployeesById(employeeId)

    fun resizePane(newSize: Int, forceResize: Boolean, noAnimation: Boolean) {
        println("The parameters are newSize = $newSize, forceResize = $forceResize, noAnimation = $noAnimation")
    }

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            var b: String? = "abc" // can be set to null
            b = null // ok
            val length = b?.length
            println(length)
            resizePane()
        }
    }
}


class abc {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            println("hello")
            resizePane()
        }
    }
}

