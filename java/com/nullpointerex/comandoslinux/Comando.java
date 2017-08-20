package com.nullpointerex.comandoslinux;

/**
 * Created by felipesalazar on 14-08-17.
 */

public class Comando {
    private String comando;
    private String descripcion;
    private String detalle;
    private String categoria;

    public Comando(String comando, String descripcion, String detalle, String categoria){
        this.comando = comando;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.categoria = categoria;

    }

    public String getCategoria() {
        return categoria;
    }

    public String getComando() {
        return comando;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDetalle() {
        return detalle;
    }

}
