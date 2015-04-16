

package taller01;
import java.util.Scanner;

public class VentaDescripcion {
    private String nombre;
    private double PrecioF;
    private String codp;
    private int cantu;

    public VentaDescripcion(Ropa R) {
        
        this.nombre = R.getNombre();
        this.codp = R.getProcod();
        this.cantu= solicitarCantidad(R.getStock());
        this.PrecioF = R.getPreciou() * 0.21 + R.getPreciou();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioF() {
        return PrecioF;
    }

    public void setPrecioF(double PrecioF) {
        this.PrecioF = PrecioF;
    }

    public String getCodp() {
        return codp;
    }

    public void setCodp(String codp) {
        this.codp = codp;
    }

    public int getCantu() {
        return cantu;
    }

    public void setCantu(int cantu) {
        this.cantu = cantu;
    }
    
    private int solicitarCantidad(int cantdis){  // Recibe la cantidad de Stock Disponible.
        int retornoStock=0;
        int cantsol=0;
        char op=0;
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingresar cantidad: ");
        cantsol=ingreso.nextInt();
        if(cantdis<cantsol){
            System.out.print("Solo se encuentean disponibles "+cantdis+" en Stock s/N: ");
            if(op=='s'){
                retornoStock=cantsol;
            }else{
                retornoStock=0;
            }
        }else{
        retornoStock=cantsol;
    }
        
        return retornoStock;
    }
    
}
