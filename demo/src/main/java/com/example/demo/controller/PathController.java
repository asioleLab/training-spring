package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@RequestMapping("/training")
public class PathController {
    @GetMapping("/api/employees/{id}")
    @ResponseBody
    public String getEmployeesById(@PathVariable String id) {
        return "ID: " + id;
    }

    @GetMapping("/api/employeeswithvariable/{id}")
    @ResponseBody
    public String getEmployeesByIdWithVariableName(@PathVariable("id") String employeeId) {
        return "ID: " + employeeId;
    }

    @GetMapping("/api/employees/{id}/{name}")
    @ResponseBody
    public String getEmployeesByIdAndName(@PathVariable("id") String employeeId, @PathVariable("name") String nome ){
        return "ID "+ employeeId + " name "+ nome;
    }

    @GetMapping("/api/employeeswithmapvariable/{id}/{name}")
    @ResponseBody
    public String getEmployeeByMappingVariable(@PathVariable Map<String ,String > pathMap){
        String id=pathMap.get("id");
        String nome=pathMap.get("name");
        if(id!=null && nome != null){
            return "ID: " + id + ", name: " + nome;
        }else{
            return "Missing Parameters";
        }
    }

    @GetMapping(value = { "/api/employeeswithrequired", "/api/employeeswithrequired/{id}" })
    @ResponseBody
    public String getEmployeesByIdWithRequired(@PathVariable(required = false) String id) {
        if (id != null) {
            return "ID: " + id;
        } else {
            return "ID missing";
        }
    }


}

