/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtrump;

import java.util.ArrayList;

/**
 *
 * @author alexy
 */
public class Productos {
    String nombre;
    String descripcion;
    int tiempo;
    ArrayList<String> nombre_materiales = new ArrayList();
    ArrayList<String> marca = new ArrayList();
    ArrayList<Integer> cantidad = new ArrayList();

    public Productos(String nombre, String descripcion, int tiempo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tiempo = tiempo;
    }

    public Productos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public ArrayList<String> getNombre_materiales() {
        return nombre_materiales;
    }

    public void setNombre_materiales(ArrayList<String> nombre_materiales) {
        this.nombre_materiales = nombre_materiales;
    }

    public ArrayList<String> getMarca() {
        return marca;
    }

    public void setMarca(ArrayList<String> marca) {
        this.marca = marca;
    }

    public ArrayList<Integer> getCantidad() {
        return cantidad;
    }

    public void setCantidad(ArrayList<Integer> cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
