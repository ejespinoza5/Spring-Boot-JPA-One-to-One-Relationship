package ec.edu.espe.je_springbootrelationship.je_services.je_manytomany;

import ec.edu.espe.je_springbootrelationship.je_entities.je_manytomany.je_Role;
import ec.edu.espe.je_springbootrelationship.je_respositories.je_manytomany.je_RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class je_RoleService {

    @Autowired
    private je_RoleRepository jeRoleRepository;

    public List<je_Role> getAllJe_Roles() {
        return jeRoleRepository.findAll();
    }

    public je_Role getJe_RoleById(Long id) {
        return jeRoleRepository.findById(id).orElseThrow(() -> new RuntimeException("Role Not Found!"));
    }

    public je_Role createJe_Role(je_Role jeRole) {
        return jeRoleRepository.save(jeRole);
    }

}
