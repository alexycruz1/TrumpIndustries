/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtrump;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author alexy
 */
public class Hilo implements Runnable {
    private JLabel hora;
    private int secs = 0;
    boolean Avanzar = true;

    public Hilo() {
    }

    public Hilo(JLabel hora) {
        this.hora = hora;
    }
    
    public int getSecs(){
        return secs;
    }
    
    public void SetAvanzar(boolean Opcion){
        Avanzar = Opcion;
    }

    @Override
    public void run() {
        while (Avanzar) {
            hora.setText(Integer.toString(secs));
            secs++;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
        }
    }
}
