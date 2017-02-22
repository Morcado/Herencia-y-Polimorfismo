/*pasos
   1. Comprobacion estatica*/
public class Figura{
	protected float area;

	public Figura(){
		area=0;
	}

	public float accedeArea(){
		return area;
	}
	
	public void calculaArea(){
	    System.out.println("ups");
    }
    
    /*regresa una cadena :v :v :v :v :v :v .v :v :v :v :v :v :v :v :v .v :V */
    public String dimeInfo(){
        return ""+area;
    }
}