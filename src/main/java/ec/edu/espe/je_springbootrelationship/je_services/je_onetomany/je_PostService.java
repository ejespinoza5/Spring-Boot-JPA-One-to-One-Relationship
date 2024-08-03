package ec.edu.espe.je_springbootrelationship.je_services.je_onetomany;

import ec.edu.espe.je_springbootrelationship.je_entities.je_onetomany.je_Post;
import ec.edu.espe.je_springbootrelationship.je_respositories.je_onetomany.je_PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class je_PostService {

    @Autowired
    private je_PostRepository jePostRepository;

    public je_Post getJe_PostById(Long id) {
        return jePostRepository.findById(id).orElseThrow(() -> new RuntimeException("Post Not Found!"));
    }

    public je_Post createJe_Post(je_Post post) {
        return jePostRepository.save(post);
    }

}
