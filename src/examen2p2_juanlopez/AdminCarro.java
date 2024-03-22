/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_juanlopez;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jjlm1
 */
public class AdminCarro implements Serializable{
    private File archivo=null;
    private ArrayList<Carro>carros =new ArrayList<>();
    
    public AdminCarro(String path){
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }
    public void agregarCarro(Carro c){
        carros.add(c);
    }
    
    public void escribir(){
         FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Carro c : carros) {
                bw.writeObject(c);
            }
            bw.flush();
        } catch (Exception ex){
            ex.printStackTrace();
        }
        try {
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(AdminCarro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void cargar(){
        try{
        carros=new ArrayList<>();
        Carro c;
        if(archivo.exists()){
            FileInputStream fis=new FileInputStream(archivo);
            ObjectInputStream ois=new ObjectInputStream(fis);
            try {
                while ((c = (Carro) ois.readObject()) != null) {
                        carros.add(c);
                }
                
                
            } catch (Exception e) {
            
            
            
        }
        
    }
    }catch (Exception e){
    
}
}
}
