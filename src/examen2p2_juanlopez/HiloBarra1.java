/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_juanlopez;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author jjlm1
 */
public class HiloBarra1 extends Thread{
    private JProgressBar barra;
    private int vel;
    private boolean vive=true;
    private Carro c;
    private HiloTiempo ht=new HiloTiempo();

    public HiloBarra1() {
    }

    public HiloBarra1(JProgressBar barra, int vel,Carro c) {
        this.barra = barra;
        this.vel = vel;
        this.c=c;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    

    @Override
    public void run() {
        while(vive){
            barra.setValue(barra.getValue()+vel);
            if(barra.getValue()>=600){
                vive=false;
                barra.setValue(0);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloBarra1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
