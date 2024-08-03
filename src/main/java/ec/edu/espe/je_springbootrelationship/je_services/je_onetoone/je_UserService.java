package ec.edu.espe.je_springbootrelationship.je_services.je_onetoone;

import ec.edu.espe.je_springbootrelationship.je_entities.je_onetoone.je_User;
import ec.edu.espe.je_springbootrelationship.je_respositories.je_onetoone.je_UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class je_UserService {

    @Autowired
    private je_UserRepository jeUserRepository;

    public List<je_User> getAllJe_Users() {
        return jeUserRepository.findAll();
    }

    public je_User createJe_User(je_User user) {
        return jeUserRepository.save(user);
    }

    public void deleteJe_User(Long id) {
        jeUserRepository.deleteById(id);
    }

}
