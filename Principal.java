import java.util.ArrayList;
public class Principal{
    public static void main(String [] args){
        Figura []figuras=new Figura[3];
        
        Triangulo t1=new Triangulo(3, 4);
        Circulo c1=new Circulo(20);
        Cuadrado cu1=new Cuadrado(12);
        
        figuras[0]=t1;
        figuras[1]=c1;
        figuras[2]=cu1;
        
        for(int i=0; i<figuras.length; i++){
            figuras[i].calculaArea();
        }
        
        for(int i=0; i<figuras.length; i++){
            figuras[i].accedeArea();
        }
    }
}