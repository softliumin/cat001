package com.sharper.cat.bean;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Admin implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "avatarPic")
    private String avatarPic;

    @Column(name = "username")
    private String username;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "role")
    private Integer role;

    @Column(name = "email")
    private String email;

    @Column(name = "status")
    private Integer status;


    @Override
    public String toString() {
        return "Admin{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", avatarPic='" + avatarPic + '\'' +
            ", username='" + username + '\'' +
            ", telephone='" + telephone + '\'' +
            ", role=" + role +
            ", email='" + email + '\'' +
            ", status=" + status +
            '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatarPic() {
        return avatarPic;
    }

    public void setAvatarPic(String avatarPic) {
        this.avatarPic = avatarPic;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
