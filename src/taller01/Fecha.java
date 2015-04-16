

package taller01;
import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    public Fecha() {
        Scanner ingreso = new Scanner(System.in);
        do{
            System.out.print("Ingresar dia: ");
            this.dia=ingreso.nextInt();
            System.out.print("Ingresar mes: ");
            this.mes = ingreso.nextInt();
            System.out.print("Ingresar año: ");
            this.año = ingreso.nextInt();
        }while(!VerificarF());
        
    }
    
    public boolean VerificarF(){
        if(dia<31 && dia>0){
            if(mes>0 && mes<12){
                if(año>999 && año<9999){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
