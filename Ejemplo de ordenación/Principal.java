import java.util.ArrayList;
import java.util.Arrays;

public class Principal{
    public static void main(String[] args){
        ArrayList<Alumno> alumnos=new ArrayList<Alumno>();
        
        alumnos.add(new Alumno(13));
        alumnos.add(new Alumno(50));
        alumnos.add(new Alumno(13));
        alumnos.add(new Alumno(60));
        alumnos.add(new Alumno(99));
        alumnos.add(new Alumno(1));
        alumnos.add(new Alumno(6));
              
        Alumno[] arrAlumnos=new Alumno[alumnos.size()];
        arrAlumnos=alumnos.toArray(arrAlumnos);
        Arrays.sort(arrAlumnos);
        for(Alumno alu: arrAlumnos)
            System.out.println(alu);
    }
}
