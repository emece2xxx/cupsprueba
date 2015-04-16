

package taller01;


public class Color {
    private Vector color;

    public Color() {
        this.color = new Vector(6);
        this.color.cargarEle("Rojo.");
        this.color.cargarEle("Azul.");
        this.color.cargarEle("Amarillo.");
        this.color.cargarEle("verde.");
    }

    public Vector getColor() {
        return color;
    }

    public void setColor(Vector color) {
        this.color = color;
    }
    
    public void imprimitColores(){
        for(int i=0;i<this.color.getI();i++){
            System.out.println("["+(i+1)+"] "+this.color.mostrarEle(i)+".");
        }
    }
    
    
    
    
    
}
