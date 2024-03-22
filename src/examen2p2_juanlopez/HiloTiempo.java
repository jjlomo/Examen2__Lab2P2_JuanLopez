/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_juanlopez;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author jjlm1
 */
public class HiloTiempo extends Thread{
    private JLabel crono;
    private int m=0,s=0;

    public HiloTiempo() {
    }

    public HiloTiempo(JLabel crono) {
        this.crono = crono;
    }

    public JLabel getCrono() {
        return crono;
    }

    public void setCrono(JLabel crono) {
        this.crono = crono;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (true) {            
            s++;
            if (s==60) {
                s=0;
                m++;
            }
            labelcrono();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloTiempo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void labelcrono(){
        if (m<10&&s<10) {
            crono.setText("0"+m+":"+"0"+s);
        }else if (m>=10&&s<10){
            crono.setText(m+":"+"0"+s);
        }else if (m>=10&&s>=10) {
            crono.setText(m+":"+s);
        }else if (m<10&&s>=10) {
            crono.setText("0"+m+":"+s);
        }
            
        
    }
    
}
