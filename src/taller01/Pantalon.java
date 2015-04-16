
package taller01;

import java.util.Scanner;

public class Pantalon extends Ropa{
    private String tipo;
    private String largo;

//    public Pantalon(String nombre, String talle, int stock, double preciou, String color, String tipo, String largo) {
//        super(nombre, talle, stock, preciou, color);
//        this.largo=largo;
//        this.tipo=tipo;
//    }
    
    public Pantalon() {
       regPantalon();
    }
    
    private void regPantalon(){
        System.out.print("Ingresar el largo del pantalon: ");
        this.largo = ingreso.next();
        
        System.out.print("Ingresar el tipo del pantalon: ");
        this.tipo = ingreso.next();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLargo() {
        return largo;
    }

    public void setLargo(String largo) {
        this.largo = largo;
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

    @Override
    public String toString() {
        return super.toString()+"  Largo"+largo+"  tipo"+tipo; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
