import java.awt.Graphics;

public class Rombo extends Figura{
    private float diagMayor;
    private float diagMen;
    
    public Rombo(float may, float men, int x, int y){
        super(x, y);
        diagMayor=may;
        diagMen=men;
    }
    
    @Override
    public void dibuja(Graphics g){
        
    }
}
