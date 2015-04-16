
package taller01;

public class Pila {
    private Object pi[];
    private int tope;
    private int n;
    
    public Pila() {
        this.n=50;
        pi= new Object[n];
        this.tope =-1;
    }
    
    public Pila(int n) {
        this.n=n;
        pi= new Object[n];
        this.tope =-1;
    }
    
    public Object[] getPi() {
        return pi;
    }

    public void setPi(Object[] pi) {
        this.pi = pi;
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public boolean PilaVacia(){
        boolean d;
        if(tope==-1){
        d=true;
        }else
        {
            d=false;
        }
   return d;
}

    public boolean PilaLena(){
        boolean d;
        if(tope==n){
            d=true;
        }else
        {
            d=false;
        }
        return d;
    }
    
    public void Apilar(Object dato){
        if(!PilaLena()){
            tope++;
            pi[tope]=dato;
        }else{
            
        }
    }
    
    public Object Desapilar(){
        Object x = 0;
        if(!PilaVacia()){
            x= pi[tope];
            tope--;
        }else{}
        return x;
    }
    
}
