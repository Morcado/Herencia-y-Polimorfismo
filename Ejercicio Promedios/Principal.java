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
        
        Planeta planeta=new Planeta();
        Pais p1=new Pais(25);
        Pais p2=new Pais(32);
        Pais p3=new Pais(94);
        
        planeta.agregaPais(p1);
        planeta.agregaPais(p2);  
        planeta.agregaPais(p3);
        
        float proHab=planeta.promedioHabitantes();
        
        System.out.println(proHab);
        System.out.println(promedio);
    }
}
