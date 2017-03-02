/*clase del cuadrado que hereda de figura*/
import java.awt.Graphics;

public class Cuadrado extends Figura{
    private int lado;
    
    public Cuadrado(int l, int x, int y){
        super(x ,y);
        lado=l;
    }
    
    @Override
    public void dibuja(Graphics g){
        g.drawRect(100, 100, 20, 20);
    }
    
   /* public void calculaArea(){
        area=lado*lado;
    }
    
    public String dimeInfo(){
        return "Cuadrado "+super.dimeInfo();
    }
    */
}