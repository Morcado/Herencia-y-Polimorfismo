import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

public class Lienzo{
    private Pelota pelota;
    
    public Lienzo(){
        pelota=new Pelota(100, 100, 10);
        EscuchadorTiempo tiempo=new EscuchadorTiempo();
        Timer t=new Timer(1000, tiempo);
        t.start();
    }
    
    class EscuchadorTiempo implements ActionListener{
        @Override
        public void actionPerfomef(ActionEvent e){
            
        }
    }
    @Override
    public void paintComponent(Graphics g){
        pelota.dibujate(g);
    }
}
