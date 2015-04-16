package taller01;

public class AppLaPilcha {
    Vector Almacen;
    Finansas VentasMov;

    public AppLaPilcha() {
        Almacen = new Vector(100);
        VentasMov = new Finansas();
    }

    public Vector getAlmacen() {
        return Almacen;
    }

    public void setAlmacen(Vector Almacen) {
        this.Almacen = Almacen;
    }

    public Finansas getVentasMov() {
        return VentasMov;
    }

    public void setVentasMov(Finansas VentasMov) {
        this.VentasMov = VentasMov;
    }
    
    public void cargarprod(Ropa R){
        char op = 0;
        int i=0;
        do{
            Almacen.cargarEle(R);
            i++;
        }while(op == 'n' || i<Almacen.getCantA());
        
    }
    
    public void MostrarRopa(){
        for(int i=0;Almacen.getCantA()>i;i++){
            Ropa R = (Ropa)Almacen.mostrarEle(i);
            System.out.print("El nombre del producto es: "+R.getNombre());
        }
    }
    
    
    public int buscar(String codp){ //Buscar por codifo de producto
        Ropa R;
        int i=0;
        boolean b=false;
        for(i=0; i<Almacen.getCantA() && !b;i++){
            R= (Ropa) Almacen.mostrarEle(i);
            if(R.getProcod().equals(codp)){
                b=true;
            }else{
            }
        }
        if(b){
            
            return i;
        }else 
        {
            return -1;
        }
    }
    
    public void CompraProducto(){
        Venta Ve_temp= new Venta();
        VentasMov.getVentas().Apilar(Ve_temp);
    }
    
}
