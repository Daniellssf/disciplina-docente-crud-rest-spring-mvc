package com.at.model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "disciplina")
public class Disciplina {

    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "name")
    String name;

    public Disciplina(String name) {
        this.name = name;
    }

    public Disciplina() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
