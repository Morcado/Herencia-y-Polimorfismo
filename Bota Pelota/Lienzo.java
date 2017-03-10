import javax.swing.JPanel;
import java.awt.Graphics;

public class Lienzo extends JPanel{
    private Pelota pelota;
    
    public Lienzo(){
        pelota=new Pelota(100, 100, 10);        
    }
    
    @Override
    public void paintComponent(Graphics g){
        pelota.dibujate(g);
    }
    
    public void actua(){
        //pelota.muevete(this.getBounds());
        this.rePaint();
    }
}
