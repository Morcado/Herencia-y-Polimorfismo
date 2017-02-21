public class Principal{
    public static void main(String [] args){
        Triangulo t1=new Triangulo(3, 4);
        Circulo c1=new Circulo(20);
        Cuadrado cu1=new Cuadrado(12);
        t1.calculaArea();
        c1.calculaArea();
        cu1.calculaArea();
        System.out.println(t1.accedeArea());
        System.out.println(c1.accedeArea());
        System.out.println(cu1.accedeArea());
    }
}