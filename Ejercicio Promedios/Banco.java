import java.util.ArrayList;

public class Banco{
    private ArrayList<CuentaBancaria> cuentas;
    
    public Banco(){
        cuentas=new ArrayList<CuentaBancaria>();
    }
    
    public void agregaCuenta(CuentaBancaria nueva){
        cuentas.add(nueva);
    }
    
}
