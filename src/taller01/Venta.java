
package taller01;
import java.util.Scanner;

public class Venta {
    private String codV;
    private Pila Vdes;
    private Fecha fechac;
    private double total;

    public Venta() {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingresar el codigo: ");
        String codV= ingreso.next();
        this.codV = "123";
        this.Vdes = new Pila();
        this.fechac = new Fecha();
        this.total = 0;
    }

    public String getCodV() {
        return codV;
    }

    public void setCodV(String codV) {
        this.codV = codV;
    }

    public Pila getVdes() {
        return Vdes;
    }

    public void setVdes(Pila Vdes) {
        this.Vdes = Vdes;
    }

    public Fecha getFechac() {
        return fechac;
    }

    public void setFechac(Fecha fechac) {
        this.fechac = fechac;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    public void vendeProd(Ropa R){
        Scanner ingreso = new Scanner(System.in);
        int cant;
        
        char op = 0;
        do{
            System.out.print("Ingresar codigo del Cantidad: ");
            cant = ingreso.nextInt();
            VentaDescripcion VD = new VentaDescripcion(R);
            if(!Vdes.PilaLena()){
                Vdes.Apilar(VD);
            }else{
                System.out.println("Pila llena");
            }
            
            System.out.print("Desea ingresar otro codpro S/N: ");
            op = ingreso.next().charAt(0);
        }while(op != 's');
        
    }
    
    public void Calculartotal(){
        
    }
    
    
}
