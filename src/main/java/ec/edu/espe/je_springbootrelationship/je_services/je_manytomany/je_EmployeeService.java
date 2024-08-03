package ec.edu.espe.je_springbootrelationship.je_services.je_manytomany;

import ec.edu.espe.je_springbootrelationship.je_entities.je_manytomany.je_Employee;
import ec.edu.espe.je_springbootrelationship.je_respositories.je_manytomany.je_EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class je_EmployeeService {

    @Autowired
    private je_EmployeeRepository employeeRepository;

    public List<je_Employee> getAllJe_Employees() {
        return employeeRepository.findAll();
    }

    public je_Employee getJe_EmployeeById(Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee Not Found!"));
    }

    public je_Employee createJe_Employee(je_Employee jeEmployee) {
        return employeeRepository.save(jeEmployee);
    }

}
