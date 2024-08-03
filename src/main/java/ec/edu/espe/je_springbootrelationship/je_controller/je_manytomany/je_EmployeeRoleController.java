package ec.edu.espe.je_springbootrelationship.je_controller.je_manytomany;

import ec.edu.espe.je_springbootrelationship.je_entities.je_manytomany.je_Employee;
import ec.edu.espe.je_springbootrelationship.je_entities.je_manytomany.je_Role;
import ec.edu.espe.je_springbootrelationship.je_services.je_manytomany.je_EmployeeService;
import ec.edu.espe.je_springbootrelationship.je_services.je_manytomany.je_RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class je_EmployeeRoleController {

    @Autowired
    private je_EmployeeService je_employeeService;
    @Autowired
    private je_RoleService je_roleService;
    @GetMapping(path = "/employees")
    public ResponseEntity<List<je_Employee>> getJe_Employees() {
        return ResponseEntity.ok().body(je_employeeService.getAllJe_Employees());
    }
    @GetMapping(path = "/employees/{je_id}")
    public ResponseEntity<je_Employee> getJe_Employee(@PathVariable("je_id") Long je_id) {
        return ResponseEntity.ok().body(je_employeeService.getJe_EmployeeById(je_id));
    }
    @PostMapping(path = "/employees")
    public ResponseEntity<je_Employee> createJe_Employee(@RequestBody je_Employee je_employee) {
        return new ResponseEntity<>(je_employeeService.createJe_Employee(je_employee), HttpStatus.CREATED);
    }




    @GetMapping(path = "/roles")
    public ResponseEntity<List<je_Role>> getJe_Roles() {
        return ResponseEntity.ok().body(je_roleService.getAllJe_Roles());
    }

    @GetMapping(path = "/roles/{je_id}")
    public ResponseEntity<je_Role> getJe_Role(@PathVariable("je_id") Long je_id) {
        return ResponseEntity.ok().body(je_roleService.getJe_RoleById(je_id));
    }

    @PostMapping(path = "/roles")
    public ResponseEntity<je_Role> createJe_Role(@RequestBody je_Role je_role) {
        return new ResponseEntity<>(je_roleService.createJe_Role(je_role), HttpStatus.CREATED);
    }

}
