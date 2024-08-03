package ec.edu.espe.je_springbootrelationship.je_entities.je_manytomany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@Table(name = "je_roles")
public class je_Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long je_id;
    String je_name;

    @ManyToMany(mappedBy = "jeRoles")
    @JsonIgnore
    Set<je_Employee> jeEmployees = new HashSet<>();










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

    public Set<je_Employee> getJeEmployees() {
        return jeEmployees;
    }

    public void setJeEmployees(Set<je_Employee> jeEmployees) {
        this.jeEmployees = jeEmployees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        je_Role jeRole = (je_Role) o;
        return je_id.equals(jeRole.je_id) && je_name.equals(jeRole.je_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(je_id, je_name);
    }
}
