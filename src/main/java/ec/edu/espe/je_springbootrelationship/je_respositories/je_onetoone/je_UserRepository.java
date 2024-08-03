package ec.edu.espe.je_springbootrelationship.je_respositories.je_onetoone;

import ec.edu.espe.je_springbootrelationship.je_entities.je_onetoone.je_User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface je_UserRepository extends JpaRepository<je_User, Long> {
}
