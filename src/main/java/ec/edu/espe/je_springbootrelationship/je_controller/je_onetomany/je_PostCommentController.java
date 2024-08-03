package ec.edu.espe.je_springbootrelationship.je_controller.je_onetomany;

import ec.edu.espe.je_springbootrelationship.je_entities.je_onetomany.je_Comment;
import ec.edu.espe.je_springbootrelationship.je_entities.je_onetomany.je_Post;
import ec.edu.espe.je_springbootrelationship.je_services.je_onetomany.je_CommentService;
import ec.edu.espe.je_springbootrelationship.je_services.je_onetomany.je_PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class je_PostCommentController {

    @Autowired
    private je_CommentService je_commentService;

    @Autowired
    private je_PostService je_postService;

    @GetMapping(path = "/comments")
    public ResponseEntity<List<je_Comment>> getJe_Comments() {
        return ResponseEntity.ok().body(je_commentService.getAllJe_Comments());
    }

    @PostMapping(path = "/comments")
    public ResponseEntity<je_Comment> createJe_Comment(@RequestBody je_Comment je_comment) {
        return new ResponseEntity<>(je_commentService.createJe_Comment(je_comment), HttpStatus.CREATED);
    }

    @GetMapping(path = "/posts/{je_id}")
    public ResponseEntity<je_Post> getJe_Post(@PathVariable("je_id") Long je_id) {
        return ResponseEntity.ok().body(je_postService.getJe_PostById(je_id));
    }

    @PostMapping(path = "/posts")
    public ResponseEntity<je_Post> createJe_Post(@RequestBody je_Post je_post) {
        return new ResponseEntity<>(je_postService.createJe_Post(je_post), HttpStatus.CREATED);
    }
}
