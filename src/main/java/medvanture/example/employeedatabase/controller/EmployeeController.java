package medvanture.example.employeedatabase.controller;

import medvanture.example.employeedatabase.entity.Employee;
import medvanture.example.employeedatabase.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee-app")
public class EmployeeController
{
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/getById/{empId}")  //localhost:8787/employee-app/getById/
    public Employee getById(@PathVariable ("empId") Integer empId)

    {
        return employeeService.getById(empId);
    }

    @PostMapping("saveEmployee")
    public Employee saveEmployee(@RequestBody Employee employee)
    {
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("deleteById/{empId}")
    public void deleteById(@PathVariable Integer empId)
    {
        employeeService.deleteEmployee(empId);
    }

    @GetMapping("/getByAllEmployee")
    public List<Employee> getbyAllId()
    {
        return employeeService.getAllEmployee();
    }

    @PutMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody Employee employee)
    {
        return employeeService.saveEmployee(employee);
    }

}
