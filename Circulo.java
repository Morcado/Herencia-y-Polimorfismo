/*clase del circulo que hereda de figura*/
public class Circulo extends Figura{
    private float radio;
    
    public Circulo(float r){
        radio=r;
    }
    
    public void calculaArea(){
        area=radio*radio*(float)3.1416;
    }
    
    public String dimeInfo(){
        return "Circulo "+super.dimeInfo();
    }
}