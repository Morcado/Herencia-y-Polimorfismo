import java.util.ArrayList;

public class Planeta{
   private ArrayList<Medible> paises;
   
   public Planeta(){
       paises=new ArrayList<Medible>();
   }
   
   public void agregaPais(Pais p){
       paises.add(p);
   }
}
