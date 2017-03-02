import java.util.ArrayList;

public class Planeta{
   private ArrayList<Pais> paises;
   
   public Planeta(){
       paises=new ArrayList<Pais>();
   }
   
   public void agregaPais(Pais p){
       paises.add(p);
   }
   
   public float promedioHabitantes(){
       float resp=0;
       
       for(Pais p: paises){
           resp+=p.dameHabitantes();
       }
       return (resp/paises.size());
   }
}
