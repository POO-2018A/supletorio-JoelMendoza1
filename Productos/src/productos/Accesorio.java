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
public class Accesorio extends Productos{
  String tipo;
  String color;

    public Accesorio(String nombre, double precio, String marca, String tipo, String color) {
        super(nombre, precio, marca);
        this.tipo=tipo;
        this.color=color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
  
}
