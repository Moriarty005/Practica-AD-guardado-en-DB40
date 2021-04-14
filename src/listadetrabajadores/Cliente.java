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
public class Cliente implements Serializable{

    private int id_cliente;
    private String nombre_cliente;
    private String reserva;
    private String alergico;
    private int coste_de_la_comida;

    public Cliente(int id_cliente, String nombre_cliente, String reserva, String alergico, int coste_de_la_comida) {
        this.id_cliente = id_cliente;
        this.nombre_cliente = nombre_cliente;
        this.reserva = reserva;
        this.alergico = alergico;
        this.coste_de_la_comida = coste_de_la_comida;
    }

    public Cliente() {
        this.id_cliente = 0;
        this.nombre_cliente = "";
        this.reserva = "";
        this.alergico = "";
        this.coste_de_la_comida = 0;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public void setCoste_de_la_comida(int coste_de_la_comida) {
        this.coste_de_la_comida = coste_de_la_comida;
    }


    public void setReserva(String reserva) {
        this.reserva = reserva;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public String getReserva() {
        return reserva;
    }

    public String getAlergico() {
        return alergico;
    }

    public int getCoste_de_la_comida() {
        return coste_de_la_comida;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + ", nombre_cliente=" + nombre_cliente + ", reserva=" + reserva + ", alergico=" + alergico + ", coste_de_la_comida=" + coste_de_la_comida + ", id_restaurante_donde_comio=" + '}';
    }
    
    
}
