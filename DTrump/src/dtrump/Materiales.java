/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtrump;


public class Materiales {
    String nombre;
    String descripcion;
    String marca;
    int ID;

    public Materiales() {
    }

    public Materiales(String nombre, String descripcion, String marca, int ID) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.marca = marca;
        this.ID = ID;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Materiales{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", marca=" + marca + ", ID=" + ID + '}';
    }
    
}
