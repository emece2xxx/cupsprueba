/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package taller01;

public class Finansas {
    private Pila Ventas;

    public Finansas() {
        this.Ventas = new Pila(100);
    }
    
    public Pila getVentas() {
        return Ventas;
    }

    public void setVentas(Pila Ventas) {
        this.Ventas = Ventas;
    }
    
}
