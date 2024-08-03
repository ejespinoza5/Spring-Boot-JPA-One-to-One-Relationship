package ec.edu.espe.je_springbootrelationship.je_respositories.je_manytomany;

import ec.edu.espe.je_springbootrelationship.je_entities.je_manytomany.je_Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface je_EmployeeRepository extends JpaRepository<je_Employee, Long> {
}
