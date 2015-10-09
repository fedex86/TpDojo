package com.example.profesor.appdojo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alumno on 08/10/2015.
 */
public class Noticia {

    private String titulo;
    private String link;
    private String guid;
    private String descripcion;
    private String pubDate;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public Noticia () {}

    public Noticia (String titulo, String link, String guid, String descripcion, String pubDate)
    {
        this.titulo = titulo;
        this.link = link;
        this.guid = guid;
        this.descripcion = descripcion;
        this.pubDate = pubDate;

    }



}
