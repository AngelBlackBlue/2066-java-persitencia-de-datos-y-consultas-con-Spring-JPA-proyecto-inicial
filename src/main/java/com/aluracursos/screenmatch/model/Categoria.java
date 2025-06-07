package com.aluracursos.screenmatch.model;

public enum Categoria {

    ACCION("Action"),
    ROMACE("Romance"),
    COMEDIA("Comedy"),
    DRAMA("Drama"),
    CRIME("Crime");

    private String categotiaOMDB;

    Categoria (String categotiaOMDB){
        this.categotiaOMDB = categotiaOMDB;
    };

    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categotiaOMDB.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Ninguna categoria encontrada: " + text);
    }



}
