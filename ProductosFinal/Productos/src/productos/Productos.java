/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;
import java.io.Serializable;
/**
 *
 * @author ESFOT
 */
public class Productos implements Serializable{
    String nombre;
    double precio;
    String marca;
public Productos(){
    
}
    public Productos(String nombre, double precio, String marca) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
