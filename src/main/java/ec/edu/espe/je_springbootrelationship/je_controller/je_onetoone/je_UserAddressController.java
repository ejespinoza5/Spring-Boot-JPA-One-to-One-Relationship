package ec.edu.espe.je_springbootrelationship.je_controller.je_onetoone;

import ec.edu.espe.je_springbootrelationship.je_entities.je_onetoone.je_User;
import ec.edu.espe.je_springbootrelationship.je_services.je_onetoone.je_UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class je_UserAddressController {

    @Autowired
    private je_UserService je_userService;

    @GetMapping(path = "/users")
    public ResponseEntity<List<je_User>> getJe_Users() {
        return ResponseEntity.ok().body(je_userService.getAllJe_Users());
    }

    @PostMapping(path = "/users")
    public ResponseEntity<je_User> createJe_User(@RequestBody je_User je_user) {
        return new ResponseEntity<>(je_userService.createJe_User(je_user), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/users/{je_id}")
    public ResponseEntity<?> deleteJe_User(@PathVariable Long je_id) {
        je_userService.deleteJe_User(je_id);
        return ResponseEntity.ok("User Deleted");
    }

}
