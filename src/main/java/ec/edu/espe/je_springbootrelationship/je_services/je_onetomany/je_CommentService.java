package ec.edu.espe.je_springbootrelationship.je_services.je_onetomany;

import ec.edu.espe.je_springbootrelationship.je_entities.je_onetomany.je_Comment;
import ec.edu.espe.je_springbootrelationship.je_respositories.je_onetomany.je_CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class je_CommentService {

    @Autowired
    private je_CommentRepository jeCommentRepository;

    public List<je_Comment> getAllJe_Comments() {
        return jeCommentRepository.findAll();
    }

    public je_Comment createJe_Comment(je_Comment jeComment) {
        return jeCommentRepository.save(jeComment);
    }

}
