package com.at.model;


import javax.persistence.*;

@Entity
@Table(name = "docente")
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "nome")
    String nome;
    @Column(name = "email")
    String email;
    @Column(name = "password")
    String password;
    @ManyToOne(cascade=CascadeType.PERSIST) //tudo que eu fizer na classe Docente, será feito na classe Disciplina
    @JoinColumn(name = "id_disciplina")
    Disciplina disciplina;


    public Docente(String nome, String email, String password, Disciplina disciplina) {
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.disciplina = disciplina;
    }

    public Docente() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", disciplina=" + disciplina +
                '}';
    }
}
