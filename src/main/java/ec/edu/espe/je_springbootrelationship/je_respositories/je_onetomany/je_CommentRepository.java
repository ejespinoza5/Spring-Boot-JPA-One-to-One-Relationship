package ec.edu.espe.je_springbootrelationship.je_respositories.je_onetomany;

import ec.edu.espe.je_springbootrelationship.je_entities.je_onetomany.je_Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface je_CommentRepository extends JpaRepository<je_Comment, Long> {
}
