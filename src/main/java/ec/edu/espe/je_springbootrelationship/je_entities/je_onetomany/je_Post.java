package ec.edu.espe.je_springbootrelationship.je_entities.je_onetomany;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Data

@Entity
@Table(name = "je_posts")
public class je_Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long je_id;
    String je_title;
    String je_description;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "post_id", referencedColumnName = "je_id")
    Set<je_Comment> jeComments = new HashSet<>();

    public je_Post(Long je_id, String je_title, String je_description, Set<je_Comment> jeComments) {
        this.je_id = je_id;
        this.je_title = je_title;
        this.je_description = je_description;
        this.jeComments = jeComments;
    }




    public Long getJe_id() {
        return je_id;
    }

    public void setJe_id(Long je_id) {
        this.je_id = je_id;
    }

    public String getJe_title() {
        return je_title;
    }

    public void setJe_title(String je_title) {
        this.je_title = je_title;
    }

    public String getJe_description() {
        return je_description;
    }

    public void setJe_description(String je_description) {
        this.je_description = je_description;
    }

    public Set<je_Comment> getJeComments() {
        return jeComments;
    }

    public void setJeComments(Set<je_Comment> jeComments) {
        this.jeComments = jeComments;
    }
}
