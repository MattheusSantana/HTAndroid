package com.htcursos.myapplication.models;

import java.io.Serializable;

/**
 * Created by Matheus on 30/04/2016.
 */
public class Users implements Serializable{



    private String nome;

    private String email;

    private String cell;

    public Users(String nome, String email, String cell){
        this.nome = nome;
        this.email = email;
        this.cell = cell;
    }

    public Users() {

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

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }
}
