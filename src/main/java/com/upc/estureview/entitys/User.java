package com.upc.estureview.entitys;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "usuario")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nameUser", length = 60, nullable = false)
    private String nameUser;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> typeUser;
    @Column(name = "email",length = 35,nullable = false)
    private String email;
    private String password;
    private String districUser;
    private int ageUser;

    public User() {
    }

    public User(Long id, String nameUser, List<Role> typeUser, String email, String password, String districUser, int ageUser) {
        this.id = id;
        this.nameUser = nameUser;
        this.typeUser = typeUser;
        this.email = email;
        this.password = password;
        this.districUser = districUser;
        this.ageUser = ageUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nameUser='" + nameUser + '\'' +
                ", typeUser=" + typeUser +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", districUser='" + districUser + '\'' +
                ", ageUser=" + ageUser +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public List<Role> getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(List<Role> typeUser) {
        this.typeUser = typeUser;
    }

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

    public String getDistricUser() {
        return districUser;
    }

    public void setDistricUser(String districUser) {
        this.districUser = districUser;
    }

    public int getAgeUser() {
        return ageUser;
    }

    public void setAgeUser(int ageUser) {
        this.ageUser = ageUser;
    }
}
