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
    node head;
    node top;

    public Cola_Empleados() {
    }

    public Cola_Empleados(int size, node head, node top) {
        this.size = size;
        this.head = head;
        this.top = top;
    }
    
    public void Queue(Object empleado){
        if (size == 0) {
            head.setValue(empleado);
        }else if(size == 1){
            head.setNext(new node(empleado, null));
            top = head.getNext();
        }else{
            top.setNext(new node(empleado, null));
            top = top.getNext();
        }
        size++;
    }
    
    public void DeQueue(){
        head = head.getNext();
        size--;
    }
    
    public void Peek(){
        head.getValue();
    }
    
    public int GetSize(){
        return size;
    }
}
