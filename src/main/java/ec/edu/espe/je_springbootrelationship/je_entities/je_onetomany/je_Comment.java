package ec.edu.espe.je_springbootrelationship.je_entities.je_onetomany;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "je_comments")
public class je_Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long je_id;
    String je_author;
    String je_content;
    @Column(name = "post_id")
    Long je_postId;







    public Long getJe_id() {
        return je_id;
    }

    public void setJe_id(Long je_id) {
        this.je_id = je_id;
    }

    public String getJe_author() {
        return je_author;
    }

    public void setJe_author(String je_author) {
        this.je_author = je_author;
    }

    public String getJe_content() {
        return je_content;
    }

    public void setJe_content(String je_content) {
        this.je_content = je_content;
    }

    public Long getJe_postId() {
        return je_postId;
    }

    public void setJe_postId(Long je_postId) {
        this.je_postId = je_postId;
    }
}
