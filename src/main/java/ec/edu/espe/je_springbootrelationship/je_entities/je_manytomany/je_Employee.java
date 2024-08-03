package ec.edu.espe.je_springbootrelationship.je_entities.je_manytomany;
import lombok.Data;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@Data
@Entity
@Table(name = "je_employees")
public class je_Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long je_id;
    String je_name;
    String je_email;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "employee_roles",
            joinColumns = @JoinColumn(
                    name = "employee_id", referencedColumnName = "je_id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "je_id"
            )
    )
    Set<je_Role> jeRoles = new HashSet<>();









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

    public String getJe_email() {
        return je_email;
    }

    public void setJe_email(String je_email) {
        this.je_email = je_email;
    }

    public Set<je_Role> getJeRoles() {
        return jeRoles;
    }

    public void setJeRoles(Set<je_Role> jeRoles) {
        this.jeRoles = jeRoles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        je_Employee jeEmployee = (je_Employee) o;
        return je_id.equals(jeEmployee.je_id) && je_name.equals(jeEmployee.je_name) && je_email.equals(jeEmployee.je_email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(je_id, je_name, je_email);
    }
}
