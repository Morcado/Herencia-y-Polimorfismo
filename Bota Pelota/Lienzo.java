import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.awt.Rectangle;

public class Lienzo extends JPanel{ // implements KeyListener
    private LinkedList<Pelota> pelotas;
    
    public Lienzo(){
        pelotas = new LinkedList<Pelota>();
        pelotas.add(new Pelota(100, 100, 10));
        EscuchadorRaton escuchaRaton = new EscuchadorRaton();
        this.addMouseListener(escuchaRaton);
    }
    
    public void actua(){
        Rectangle r = this.getBounds();
        /*le indica a cada pelota que se mueva*/
        for(Pelota p: pelotas)
            p.muevete(r);
        
        this.repaint();
        
    }    
    
    class EscuchadorRaton extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent me){
            //System.out.println(me.getX() + ", " + me.getY());
            //genera un numero aleartonriro
            int tamRandom = 10+(int)(Math.random()*20);
            Pelota pelotaNueva = new Pelota(me.getX(),  me.getY(), tamRandom);
            pelotas.add(pelotaNueva);
            //pelota.muevete(getBounds());
            //repaint();
        }
    }
    
    @Override
    public void paintComponent(Graphics g){
        //borrar el panel para dibujar las pelotas en una nueva opcion
        super.paintComponent(g);
        for(Pelota p: pelotas)
            p.dibujate(g);
    }
}