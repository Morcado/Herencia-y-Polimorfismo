import java.util.ArrayList;

public class Banco{
    private ArrayList<Medible> cuentas;
    
    public Banco(){
        cuentas=new ArrayList<Medible>();
    }
    
    public void agregaCuenta(CuentaBancaria nueva){
        cuentas.add(nueva);
    }
    
}
