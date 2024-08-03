package ec.edu.espe.je_springbootrelationship.je_respositories.je_manytomany;

import ec.edu.espe.je_springbootrelationship.je_entities.je_manytomany.je_Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface je_RoleRepository extends JpaRepository<je_Role, Long> {
}
