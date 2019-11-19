package com.example.hojadevida4.utilidades;

public class Utilidades {

    //Constantes campos tabla usuario

    public static final String TABLA_USUARIO = "usuario";

    public static final String CAMPO_ID = "id";
    public static final String CAMPO_NOMBRE = "nombre";
    public static final String CAMPO_TELEFONO = "telefono";
    public static final String CAMPO_DIRECCION = "direccion";
    public static final String CAMPO_EDAD = "edad";


    public static final String CREAR_TABLA_USUARIOS = "Create table "+
            TABLA_USUARIO+" ("+CAMPO_ID+" TEXT, "+CAMPO_NOMBRE +
            " TEXT, "+CAMPO_TELEFONO+" TEXT, " +
            CAMPO_DIRECCION+" TEXT. "+CAMPO_EDAD+" INTEGER)";

}
