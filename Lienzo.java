import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Lienzo extends JPanel{
 private ArrayList<Figura> figuras;
 private Graphics g;
 
 public Lienzo(){
     figuras=new ArrayList<Figura>();
     //inicializar el arraylist
     //Circulo c1=new Circulo
    }
 
 @Override
 public void paintComponent(Graphics g){
        Graphics2D g2=(Graphics2D)g;
        /*
        for(Figuras f:figuras){
            f.dibuja(g);
        }
        */
    }
}
