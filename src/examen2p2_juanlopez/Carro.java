
package examen2p2_juanlopez;

import java.io.Serializable;

public class Carro implements Serializable{
    private String marca, modelo;
    private int vel;

    public Carro() {
    }

    public Carro(String marca, String modelo, int vel) {
        this.marca = marca;
        this.modelo = modelo;
        this.vel = vel;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVel() {
        return vel;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    @Override
    public String toString() {
        return modelo;
    }
    
   
}
