package ec.edu.espe.je_springbootrelationship.je_entities.je_onetoone;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "je_users")
public class je_User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long je_id;
    String je_name;

    @OneToOne(cascade = CascadeType.ALL)
    @MapsId
    @JoinColumn(name = "address_id", referencedColumnName = "je_id")
    je_Address je_address;

    public je_User(Long je_id, String je_name, je_Address je_address) {
        this.je_id = je_id;
        this.je_name = je_name;
        this.je_address = je_address;
    }

















    public Long getJe_id() {
        return je_id;
    }

    public void setJe_id(Long je_id) {
        this.je_id = je_id;
    }

    public String getJe_name() {
        return je_name;
    }

    public void setJe_name(String je_name) {
        this.je_name = je_name;
    }

    public je_Address getJe_address() {
        return je_address;
    }

    public void setJe_address(je_Address je_address) {
        this.je_address = je_address;
    }
}
