/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author ESFOT
 */
public class Componente extends Productos{
    String tipo;
    String capacidad;
    String velocidad;

    public Componente(String nombre, double precio, String marca,String tipo, String capacidad, String velocidad) {
        super(nombre, precio, marca);
        this.tipo=tipo;
        this.capacidad=capacidad;
        this.velocidad=velocidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }
    
}
