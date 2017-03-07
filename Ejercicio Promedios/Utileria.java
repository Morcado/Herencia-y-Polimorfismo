import java.util.ArrayList;

public class Utileria{
    public static float calculaPromedio(ArrayList<Medible> obj){
       float resp=0;
       
       for(Medible o: obj){
           resp+=o.obtenerMedida();
       }
       return (resp/obj.size());
    }
}
