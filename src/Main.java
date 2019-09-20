import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String a  = "polloman";
        System.out.println("Hello World!");

        System.out.println("cambios en la rama newBranch1");


        System.out.println("cambios en la rama2");


        System.out.println("cambios en la rama master, y le hacemos oto cambio a master");

        System.out.println("cambios en la rama3");
        System.out.println("otro cambio en la rama3");

        System.out.println(a);

        List<Persona> list = new ArrayList<>();

        Persona p1 = new Persona();
        p1.setNombre("Luis");
        list.add(p1);

        Persona p2 = list.get(0);
        p2.setNombre("Juan");

        Persona p3 = list.get(0);


        System.out.println(p3.getNombre());



        System.out.printf("cambio para ver si va con proxy");

    }


    public String rama3(){
        return "rama3 method";
    }
}
