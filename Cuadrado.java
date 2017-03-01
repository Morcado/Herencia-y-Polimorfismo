/*clase del cuadrado que hereda de figura*/
import java.awt.Graphics;

public class Cuadrado extends Figura{
    private float lado;
    
    public Cuadrado(float l, int x, int y){
        super(x ,y);
        lado=l;
    }
    
    @Override
    public void dibuja(Graphics g){
        
    }
    
   /* public void calculaArea(){
        area=lado*lado;
    }
    
    public String dimeInfo(){
        return "Cuadrado "+super.dimeInfo();
    }
    */
}