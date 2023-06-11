package medvanture.example.employeedatabase.entity;

import javax.persistence.*;


@Entity
@Table(name = "Employee")
public class Employee
{
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer empId;
    private String employeeName;
    private Integer salary;

    public Employee()
    {

    }
    public Employee(Integer empId, String employeeName, Integer salary)
    {
        this.empId = empId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public Integer getEmpId()
    {
        return empId;
    }

    public void setEmpId(Integer empId)
    {
        this.empId = empId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
