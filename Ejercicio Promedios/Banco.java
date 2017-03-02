import java.util.ArrayList;

public class Banco{
    private ArrayList<CuentaBancaria> cuentas;
    
    public Banco(){
        cuentas=new ArrayList<CuentaBancaria>();
    }
    
    public void agregaCuenta(CuentaBancaria nueva){
        cuentas.add(nueva);
    }
    
    public float calculaSaldoPromedio(){
        float res=0;
        for(CuentaBancaria c: cuentas){
            res+=c.dameSaldo();
        }
        return (res/cuentas.size());
    }
}
