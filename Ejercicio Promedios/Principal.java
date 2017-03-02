public class Principal{
    public static void main(String [] args){
        Banco banco=new Banco();
        CuentaBancaria c1=new CuentaBancaria(100);
        CuentaBancaria c2=new CuentaBancaria(200);
        CuentaBancaria c3=new CuentaBancaria(300);
        
        banco.agregaCuenta(c1);
        banco.agregaCuenta(c2);
        banco.agregaCuenta(c3);
        
        float promedio=banco.calculaSaldoPromedio();
        System.out.println(promedio);
    }
}
