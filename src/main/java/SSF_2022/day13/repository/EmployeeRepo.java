package SSF_2022.day13.repository;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import SSF_2022.day13.model.Employee;

@Repository
public class EmployeeRepo {

    private List<Employee> employees;
    
    public EmployeeRepo() throws ParseException {
        if (employees ==null){
            employees = new ArrayList<Employee>();
        }

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date dt = df.parse("1980-10-15");
        Employee emp = new Employee("Derrick", "Tan", "Derrick123@gmail.com"
        , "99908880", 1800, dt, "10 Ghim Moh", 277818);

        employees.add(emp);

        dt = df.parse("1993-12-29");
        emp = new Employee("Dennis", "ng", "Dennis@gmail.com"
        , "99908880", 1800, dt, "10 Ghim Moh", 277818);

        employees.add(emp);

    }

    public List<Employee> findAll() {
        return employees;
    }

    public Boolean save(Employee employee) {

        Boolean result = employees.add(employee);
        return result;
    }

    public Boolean delete(Employee employee) {
        Boolean result = false;
        int employeeIndex = employees.indexOf(employee);

        if(employeeIndex>=0){
            employees.remove(employeeIndex);
            result=true;
        }

        return result;
    }
    


}
