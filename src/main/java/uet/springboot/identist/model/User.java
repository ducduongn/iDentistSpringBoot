package uet.springboot.identist.model;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@MappedSuperclass
public class User extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "email")
    @NotEmpty
    private String email;

    @Column(name = "password")
    @NotEmpty
    private String password;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "visit", fetch = FetchType.LAZY)
    private Set<Visit> visitList;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Visit> getVisitList() {
        return visitList;
    }

    public void setVisitList(Set<Visit> visitList) {
        this.visitList = visitList;
    }
}
