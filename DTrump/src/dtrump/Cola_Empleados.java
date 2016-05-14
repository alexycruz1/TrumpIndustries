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
public class Cola_Empleados {

    int size = 0;
    node head = null;
    node top = null;

    public Cola_Empleados() {
    }

    public Cola_Empleados(int size, node head, node top) {
        this.size = size;
        this.head = head;
        this.top = top;
    }

    public void Queue(Empleados empleado) {
        size++;
        node nuevo_empleado = new node(empleado, null);
        if (size == 1) {
            head = nuevo_empleado;
        } else if (size == 2) {
            head.setNext(new node(empleado, null));
            top = head.getNext();
        } else {
            top.setNext(new node(empleado, null));
            top = top.getNext();
        }
    }

    public void DeQueue() {
        if (size == 1) {
            head = null;
            top = null;
            size--;
        } else if(size == 2){
            head = top;
            top = null;
            size--;
        }else{
            head = head.getNext();
            size--;
        }

    }

    public void Peek() {
        head.getValue();
    }

    public int GetSize() {
        return size;
    }
}
