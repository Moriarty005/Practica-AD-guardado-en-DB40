/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadetrabajadores;

import java.io.Serializable;

/**
 *
 * @author Alexeltocayo
 */
public class Plato implements Serializable{
    
    private int id_plato;
    private String nombre_plato;
    private String sabor_principal;
    private int tiempo_de_prep_en_mins;
    private int num_ingredientes;
    private int id_restaurante_donde_se_sirve_este_plato;

    public Plato() {
        this.id_plato = 0;
        this.nombre_plato = "";
        this.sabor_principal = "";
        this.tiempo_de_prep_en_mins = 0;
        this.num_ingredientes = 0;
    }
    
    public Plato(int id_plato, String nombre_plato, String sabor_principal, int tiempo_de_prep, int num_restaurantes) {
        
        this.id_plato = id_plato;
        this.nombre_plato = nombre_plato;
        this.sabor_principal = sabor_principal;
        this.tiempo_de_prep_en_mins = tiempo_de_prep;
        this.num_ingredientes = num_restaurantes;
    }

    public int getId_plato() {
        return id_plato;
    }

    public String getNombre_plato() {
        return nombre_plato;
    }

    public String getSabor_principal() {
        return sabor_principal;
    }

    public int getTiempo_de_prep() {
        return tiempo_de_prep_en_mins;
    }

    public int getNum_ingredientes() {
        return num_ingredientes;
    }

    public int getTiempo_de_prep_en_mins() {
        return tiempo_de_prep_en_mins;
    }

    public int getId_restaurante_donde_se_sirve_este_plato() {
        return id_restaurante_donde_se_sirve_este_plato;
    }

    public void setId_plato(int id_plato) {
        this.id_plato = id_plato;
    }

    public void setNombre_plato(String nombre_plato) {
        this.nombre_plato = nombre_plato;
    }

    public void setSabor_principal(String sabor_principal) {
        this.sabor_principal = sabor_principal;
    }

    public void setTiempo_de_prep(int tiempo_de_prep) {
        this.tiempo_de_prep_en_mins = tiempo_de_prep;
    }

    public void setNum_ingredientes(int num_restaurantes) {
        this.num_ingredientes = num_restaurantes;
    }

    public void setTiempo_de_prep_en_mins(int tiempo_de_prep_en_mins) {
        this.tiempo_de_prep_en_mins = tiempo_de_prep_en_mins;
    }

    public void setId_restaurante_donde_se_sirve_este_plato(int id_restaurante_donde_se_sirve_este_plato) {
        this.id_restaurante_donde_se_sirve_este_plato = id_restaurante_donde_se_sirve_este_plato;
    }

    @Override
    public String toString() {
        return "Plato{" + "id_plato=" + id_plato + ", nombre_plato=" + nombre_plato + ", sabor_principal=" + sabor_principal + ", tiempo_de_prep_en_mins=" + tiempo_de_prep_en_mins + ", num_ingredientes=" + num_ingredientes + ", id_restaurante_donde_se_sirve_este_plato=" + id_restaurante_donde_se_sirve_este_plato + '}';
    }
    
    
}
