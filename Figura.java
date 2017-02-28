/*pasos
   1. Comprobacion estatica*/
public abstract class Figura{
    //protected float area;
    private int posx;
    private int posy;
    
    public Figura(int x, int y){
        posx=x;
        posy=y;
    }
    protected int dameX(){
       return posx;
   }
   
   protected int dameY(){
       return posy;
   }
   public abstract void dibuja(Graphics g);
   
    /*
    public float accedeArea(){
        return area;
    }
    
    
    public void calculaArea(){
        System.out.println("ups");
    }
    
    //regresa una cadena :v :v :v :v :v :v .v :v :v :v :v :v :v :v :v .v :V 
    public String dimeInfo(){
        return ""+area;
    }
    
    
    @Override
    public boolean equals(Object obj){
        return this.area==((Figura)obj).area; //compara si dos figuras tienen el mismo area
        
    }
    */
   
   
}