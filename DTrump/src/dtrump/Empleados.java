/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtrump;

/**
 *
 * @author alexy
 */
public class Empleados {
    String nombre;
    int ID;
    int edad;
    String direccion;
    int salario;

    public Empleados() {
    }

    public Empleados(String nombre, int ID, int edad, String direccion, int salario) {
        this.nombre = nombre;
        this.ID = ID;
        this.edad = edad;
        this.direccion = direccion;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
