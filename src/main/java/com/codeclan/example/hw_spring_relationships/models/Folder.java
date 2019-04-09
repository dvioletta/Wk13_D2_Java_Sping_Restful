package com.codeclan.example.hw_spring_relationships.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder implements Serializable {

    @Column(name = "title")
    private String title;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @OneToMany(mappedBy = "folder")
    private List<File> files;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;


    public Folder(String title, User user){
        this.title = title;
        this.user = user;
        this.files = new ArrayList<>();
    }

    public Folder(){

    }

    public
    String getTitle() {
        return title;
    }

    public
    void setTitle(String title) {
        this.title = title;
    }

    public
    Long getId() {
        return id;
    }

    public
    void setId(Long id) {
        this.id = id;
    }

    public
    User getUser() {
        return user;
    }

    public
    void setUsers(User user) {
        this.user = user;
    }

    public List<File> getFiles(){
        return files;
    }

    public void setFiles(List<File> files){
        this.files = files;
    }
}
