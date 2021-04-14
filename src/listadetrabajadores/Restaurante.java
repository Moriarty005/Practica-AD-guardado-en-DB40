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
public class Restaurante implements Serializable{
    
    private int id_restaurante;
    private String nombre_restaurante;
    private String direccion_restaurante;
    private int aforo_maximo_restaurante;
    private int numero_empleados_restaurante;
    private int id_cliente_que_al_que_restaurante_vende;
    
    public Restaurante() {
        this.id_restaurante = 0;
        this.nombre_restaurante = "";
        this.direccion_restaurante = "";
        this.aforo_maximo_restaurante = 0;
        this.numero_empleados_restaurante = 0;
    }

    public Restaurante(int id_restaurante, String nombre_restaurante, String direccion_restaurante, int aforo_maximo_restaurante, int numero_empleados_restaurante) {
        this.id_restaurante = id_restaurante;
        this.nombre_restaurante = nombre_restaurante;
        this.direccion_restaurante = direccion_restaurante;
        this.aforo_maximo_restaurante = aforo_maximo_restaurante;
        this.numero_empleados_restaurante = numero_empleados_restaurante;
    }

    public int getId_restaurante() {
        return id_restaurante;
    }

    public String getNombre_restaurante() {
        return nombre_restaurante;
    }

    public String getDireccion_restaurante() {
        return direccion_restaurante;
    }

    public int getAforo_maximo_restaurante() {
        return aforo_maximo_restaurante;
    }

    public int getNumero_empleados_restaurante() {
        return numero_empleados_restaurante;
    }

    public int getId_cliente_que_al_que_restaurante_vende() {
        return id_cliente_que_al_que_restaurante_vende;
    }

    public void setId_restaurante(int id_restaurante) {
        this.id_restaurante = id_restaurante;
    }

    public void setNombre_restaurante(String nombre_restaurante) {
        this.nombre_restaurante = nombre_restaurante;
    }

    public void setDireccion_restaurante(String direccion_restaurante) {
        this.direccion_restaurante = direccion_restaurante;
    }

    public void setAforo_maximo_restaurante(int aforo_maximo_restaurante) {
        this.aforo_maximo_restaurante = aforo_maximo_restaurante;
    }

    public void setNumero_empleados_restaurante(int numero_empleados_restaurante) {
        this.numero_empleados_restaurante = numero_empleados_restaurante;
    }

    public void setId_cliente_que_al_que_restaurante_vende(int id_cliente_que_al_que_restaurante_vende) {
        this.id_cliente_que_al_que_restaurante_vende = id_cliente_que_al_que_restaurante_vende;
    }

    @Override
    public String toString() {
        return "Restaurante{" + "id_restaurante=" + id_restaurante + ", nombre_restaurante=" + nombre_restaurante + ", direccion_restaurante=" + direccion_restaurante + ", aforo_maximo_restaurante=" + aforo_maximo_restaurante + ", numero_empleados_restaurante=" + numero_empleados_restaurante + ", id_cliente_que_al_que_restaurante_vende=" + id_cliente_que_al_que_restaurante_vende + '}';
    }
    
    
}
