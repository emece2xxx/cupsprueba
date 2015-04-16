
package taller01;


public class Talle {
    private Vector talle;

    public Talle() {
        this.talle = new Vector(6);
        this.talle.cargarEle("S");
        this.talle.cargarEle("M");
        this.talle.cargarEle("L");
        this.talle.cargarEle("X");
        this.talle.cargarEle("XL");
        this.talle.cargarEle("XLL");
    }
    
    public void imprimitTalles(){
        for(int i=0;i<this.talle.getI();i++){
            System.out.println("["+(i+1)+"] "+this.talle.mostrarEle(i)+".");
        }
    }
    
    
}

