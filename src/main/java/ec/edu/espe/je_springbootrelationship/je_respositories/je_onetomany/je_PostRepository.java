package ec.edu.espe.je_springbootrelationship.je_respositories.je_onetomany;

import ec.edu.espe.je_springbootrelationship.je_entities.je_onetomany.je_Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface je_PostRepository extends JpaRepository<je_Post, Long> {
}
