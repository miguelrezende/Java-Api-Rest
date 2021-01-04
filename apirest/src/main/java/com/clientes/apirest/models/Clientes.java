package com.clientes.apirest.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.time.LocalDateTime;

@Entity
@Table(name="tb_usuarios")
public class Clientes{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;

    private String email;

    private String cpf;

    private String data_nascimento;

    public String getEmail() { return email; }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return data_nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}