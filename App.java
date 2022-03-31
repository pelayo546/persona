import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        crearPersona();
        
    }
    
    public static void crearPersona() {
    	
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu nombre");
        String nom1 = sc.next();

        System.out.println("Dime tu edad");
        int ed1 = sc.nextInt();

        System.out.println("Dime tu sexo (una letra mayuscula)");
        char sx1 = sc.next().charAt(0);

        System.out.println("Dime tu peso");
        double pes1 = sc.nextDouble();

        System.out.println("Dime tu altura");
        double alt1 = sc.nextDouble();
    	
        persona p1 = new persona(nom1, ed1, sx1, pes1, alt1);
        p1.generarDNI();
        
        System.out.println(p1);
        
    }
    

}
