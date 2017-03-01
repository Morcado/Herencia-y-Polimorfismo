import java.awt.Graphics;
import java.awt.Graphics2D;

public class Triangulo extends Figura{
    private float base;
    private float altura;
    
    public Triangulo(float b, float a, int x, int y){
        super(x, y);
        base=b;
        altura=a;
    }
    
    @Override
    public void dibuja(Graphics g){
        
    }
    /*
    public void calculaArea(){
        area=base*altura/2;
    }
    
   
    public String dimeInfo(){
        return "Triangulo "+super.dimeInfo();
    }
    */
}