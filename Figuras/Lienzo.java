import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Lienzo extends JPanel{
    private ArrayList<Figura> figuras;
    private Graphics g;
 
    public Lienzo(){
    //inicializar el arraylist
        figuras=new ArrayList<Figura>();
        Circulo c=new Circulo(10, 200, 200);
        Triangulo t=new Triangulo(25, 10, 50, 50);
        Cuadrado cu=new Cuadrado(10, 70, 70);
        //Rombo r=new Rombo()
        figuras.add(c);
        figuras.add(t);
        figuras.add(cu);
    }
 
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2=(Graphics2D)g;
        
        for(Figura f:figuras){
            f.dibuja(g);  
        }
    }
}
