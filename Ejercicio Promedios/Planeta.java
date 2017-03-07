import java.util.ArrayList;

public class Planeta{
   private ArrayList<Pais> paises;
   
   public Planeta(){
       paises=new ArrayList<Pais>();
   }
   
   public void agregaPais(Pais p){
       paises.add(p);
   }
}
