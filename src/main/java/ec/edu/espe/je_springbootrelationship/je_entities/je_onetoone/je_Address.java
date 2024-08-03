package ec.edu.espe.je_springbootrelationship.je_entities.je_onetoone;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "je_addresses")
public class je_Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long je_id;
    String je_street;
    String je_city;
    @JsonIgnore
    @OneToOne(mappedBy = "je_address")
    je_User je_user;
    public je_Address(Long je_id, String je_street, String je_city, je_User je_user) {
        this.je_id = je_id;
        this.je_street = je_street;
        this.je_city = je_city;
        this.je_user = je_user;
    }

    public Long getJe_id() {
        return je_id;
    }

    public void setJe_id(Long je_id) {
        this.je_id = je_id;
    }

    public String getJe_street() {
        return je_street;
    }

    public void setJe_street(String je_street) {
        this.je_street = je_street;
    }

    public String getJe_city() {
        return je_city;
    }

    public void setJe_city(String je_city) {
        this.je_city = je_city;
    }

    public je_User getJe_user() {
        return je_user;
    }

    public void setJe_user(je_User je_user) {
        this.je_user = je_user;
    }
}
