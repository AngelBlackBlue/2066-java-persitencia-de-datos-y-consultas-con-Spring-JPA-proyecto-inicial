package com.aluracursos.screenmatch.model;

public enum Categoria {

    ACCION("Action", "Acción"),
    ROMACE("Romance", "Romance"),
    COMEDIA("Comedy", "Comedia"),
    DRAMA("Drama", "Drama"),
    CRIME("Crime", "Crimen");

    private String categoriaOMDB;
    private String categoriaEspanol;

    Categoria (String categotiaOMDB, String categoriaEspanol){
        this.categoriaOMDB = categotiaOMDB;
        this.categoriaEspanol = categoriaEspanol;
    };

    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOMDB.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Ninguna categoria encontrada: " + text);
    }

    public static Categoria fromEspanol(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaEspanol.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Ninguna categoria encontrada: " + text);
    }





}
