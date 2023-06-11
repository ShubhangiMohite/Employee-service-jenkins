package medvanture.example.employeedatabase.service;

import medvanture.example.employeedatabase.dao.EmployeeRepository;
import medvanture.example.employeedatabase.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService
{
    @Autowired
    EmployeeRepository employeeRepository;
    public Employee getById(Integer empId)
    {
        return employeeRepository.findById(empId).get();
        //return employeeRepository.getById(empId);
    }
    public Employee saveEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }
    public void deleteEmployee(Integer empId)
    {
        employeeRepository.deleteById(empId);
    }

    public List<Employee> getAllEmployee()
    {
        return employeeRepository.findAll();
    }


}
