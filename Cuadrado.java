/*clase del cuadrado que hereda de figura*/
public class Cuadrado extends Figura{
    private float lado;
    
    public Cuadrado(float l){
        lado=l;
    }
    
    public void calculaArea(){
        area=lado*lado;
    }
}