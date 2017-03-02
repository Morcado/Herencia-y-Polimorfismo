/*clase del circulo que hereda de figura*/
import java.awt.Graphics;

public class Circulo extends Figura{
    private int radio;
    
    public Circulo(int r, int x, int y){
        super(x, y);
        radio=r;
    }
    
    @Override
    public void dibuja(Graphics g){
        g.drawOval(10, 10, radio, radio);
    }
    /*
    public void calculaArea(){
        area=radio*radio*(float)3.1416;
    }
    
    public String dimeInfo(){
        return "Circulo "+super.dimeInfo();
    }
    */
}