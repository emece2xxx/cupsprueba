
package taller01;

import java.util.Scanner;

public class Remera extends Ropa{
    private String tmanga;
    private String tcuello;
    
    public  Remera(){
        System.out.print("Tipo de cuello: ");
        this.tcuello = ingreso.next();
        
        System.out.print("Tipo de manga: ");
        this.tmanga = ingreso.next();
    }

    public String getTmanga() {
        return tmanga;
    }

    public void setTmanga(String tmanga) {
        this.tmanga = tmanga;
    }

    public String getTcuello() {
        return tcuello;
    }

    public void setTcuello(String tcuello) {
        this.tcuello = tcuello;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPreciou() {
        return preciou;
    }

    public void setPreciou(double preciou) {
        this.preciou = preciou;
    }

    public String getGrupgenero() {
        return grupgenero;
    }

    public void setGrupgenero(String grupgenero) {
        this.grupgenero = grupgenero;
    }

    public Scanner getIngreso() {
        return ingreso;
    }

    public void setIngreso(Scanner ingreso) {
        this.ingreso = ingreso;
    }
    
}
