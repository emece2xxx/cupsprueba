package taller01;




public class Vector {
    private Object V[];
    private int n;
    private int cantA;
    
    public Vector() {
        this.n = 1;
        this.V = new Object[n];
        this.cantA=0;
    }
    
     public Vector(int n) {
        this.n = n;
        this.V = new Object[n];
        this.cantA=0;
    }

    public int getCantA() {
        return cantA;
    }

    public void setCantA(int cantA) {
        this.cantA = cantA;
    }

    public Object[] getV() {
        return V;
    }

    public void setV(Object[] V) {
        this.V = V;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getI() {
        return cantA;
    }

    public void setI(int i) {
        this.cantA = i;
    }
    public boolean vectorLleno(){
        return cantA==n;
    }
    
    public boolean vectorVacio(){
        return cantA==0;
    }
    
    public void cargarEle(Object dato){
        if(!vectorLleno())
        {
            
            V[cantA]=dato;
            cantA=cantA+1;
        }else{
            
        }
    }
    public Object mostrarEle(int i){
        return V[i];
    }
    
    public Object valnumb(int i){
        return V[i];
    }
}

