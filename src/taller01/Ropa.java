

package taller01;
import java.util.Scanner;

public class Ropa {
    protected String nombre;
    protected String talle;
    protected int stock;
    protected String color;
    protected double preciou;
    protected String grupgenero;
    protected String procod;
//    private Vector gruptalles = new Vector (4);
    Scanner ingreso = new Scanner(System.in);
    
    public String getProcod() {
        return procod;
    }

    public void setProcod(String procod) {
        this.procod = procod;
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

//    public Ropa(String nombre, String talle ,int stock, double preciou, String color) {
//        this.nombre = nombre;
//        this.talle = talle;
//        this.stock = stock;
//        this.color = color;
//        this.preciou = preciou;
//    }
    
    public Ropa() {
        
        System.out.println("ingrese codigo del producto: ");
        this.procod = ingreso.next();
        
        System.out.print("Ingresar nombre o modelo del producto: ");
        this.nombre = ingreso.next();
        
        System.out.print("Ingresar la cantidad de Stock: ");
        this.stock = ingreso.nextInt();
        
        System.out.print("Ingrese el precio de una unidad: ");
        this.preciou = ingreso.nextDouble();
        
        System.out.print("Ingrese el color del producto: ");
        this.color = ingreso.next();
        
        System.out.print("Ingrese el talle: ");
        this.talle = ingreso.next(); 
    }
    
//    public void RopaDato(){
//        
//        System.out.print("Ingresar nombre o modelo del producto: ");
//        this.nombre = ingreso.next();
//        
//        System.out.print("Ingresar la cantidad de Stock: ");
//        this.stock = ingreso.nextInt();
//        
//        System.out.print("Ingrese el precio de una unidad: ");
//        this.preciou = ingreso.nextDouble();
//        
//        System.out.print("Ingrese el color del producto: ");
//        this.color = ingreso.next();
//        
//        System.out.print("Ingrese el talle: ");
//        this.talle = ingreso.next();   
//    }
    
//    public void CargarDetalles(Vector datos, int op){
//       char opcion; 
//       Talle t = new Talle();
//       boolean b = true;
//        if (op==1){
//            do{
//                if(!b){
//                    System.out.println("-------Error-------");
//                }
//                t.imprimitTalles();
//                System.out.println("Ingrear opcion:");
//                opcion = ingreso.next().charAt(0);
//                b = false;
//            }while(!verifica(opcion, '1', '6'));
//            this.talle.cargarEle(opcion);
//            
//        }else if(op==2){
//            b = true;
//            do{
//                if(!b){
//                    System.out.println("-------Error-------");
//                }
//                t.imprimitTalles();
//                System.out.println("Ingrear opcion:");
//                opcion = ingreso.next().charAt(0);
//                b = false;
//            }while(!verifica(opcion, '1', '6'));
//            this.color.cargarEle(opcion);
//        }
//    }
    
    
    public boolean verifica(char opcion, char inicio, char fin){
        return opcion >= inicio && opcion <= fin;
    }
    
    public String toString(){
        return "Nombre: "+nombre+"-_-Stock: "+stock;
    }
}
