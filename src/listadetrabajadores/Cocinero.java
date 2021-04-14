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
public class Cocinero implements Serializable{
    
    
    private Integer id_cocinero;
    private double salario;
    private String nombre;
    private String especialidad;
    private int numero_de_premios;
    private int id_del_plato_que_cocina_este_cocinero;
    
    public Cocinero() {
        this.id_cocinero = 0;
        this.nombre = "";
        this.especialidad = "";
        this.numero_de_premios = 0;
        this.salario = 0.0;
    }

    public Cocinero(int id_cocinero, double salario, String nombre, String especialidad, int numero_de_premios) {
        this.id_cocinero = id_cocinero;
        this.salario = salario;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.numero_de_premios = numero_de_premios;
    }

    public Integer getId_cocinero() {
        return id_cocinero;
    }

    public double getSalario() {
        return salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getNumero_de_premios() {
        return numero_de_premios;
    }
    
    public int getId_del_plato_que_cocina_este_cocinero() {
        return id_del_plato_que_cocina_este_cocinero;
    }

    public void setId_cocinero(Integer id_cocinero) {
        this.id_cocinero = id_cocinero;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setNumero_de_premios(int numero_de_premios) {
        this.numero_de_premios = numero_de_premios;
    }

    public void setId_del_plato_que_cocina_este_cocinero(int id_del_plato_que_cocina_este_cocinero) {
        this.id_del_plato_que_cocina_este_cocinero = id_del_plato_que_cocina_este_cocinero;
    }

    @Override
    public String toString() {
        return "Cocinero{" + "id_cocinero=" + id_cocinero + ", salario=" + salario + ", nombre=" + nombre + ", especialidad=" + especialidad + ", numero_de_premios=" + numero_de_premios + ", id_del_plato_que_cocina_este_cocinero=" + id_del_plato_que_cocina_este_cocinero + '}';
    }
    
    
}
