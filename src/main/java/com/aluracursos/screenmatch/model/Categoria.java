package com.aluracursos.screenmatch.model;

public enum Categoria {

    AACION("Action"),
    ROMACE("Romance"),
    COMEDIA("Comedy"),
    DRAMA("Drama"),
    CRIME("Crime");

    private String categotiaOMDB;

    Categoria (String categotiaOMDB){
        this.categotiaOMDB = categotiaOMDB;
    };

}
