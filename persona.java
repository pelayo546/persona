public class persona {

    private String nombre;
    private int edad;
    private char sexo;
    private String DNI;
    private double peso;
    private double altura;

    // Contructores
    public persona(String nombre, int edad, char sexo, double peso, double altura) {

        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;

    }

    // Metodos
    public String IMC() {

        double indiceMasaCorporal;
        String base = "";

        indiceMasaCorporal = peso / (altura * altura);

        if (indiceMasaCorporal < 20) {

            base = "Infra peso";

        }

        else if (indiceMasaCorporal > 20 && indiceMasaCorporal < 25) {

            base = "Peso ideal";

        }

        else if (indiceMasaCorporal > 25) {

            base = "Sobre peso";

        }

        return base;

    }

    public String mayoredad() {

    if (edad > 18) {

         return "Es mayor de edad";

        }
    else {
    	
        return"Es menor de edad";
    }

    }

    public void comprobarSexo() {

        if (sexo != 'H' && sexo != 'M') {

            sexo = 'H';

        }
    }

    public void generarDNI() {

        final int divisor = 23;

        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);

        char letraDNI = generaLetraDNI(res);

        DNI = Integer.toString(numDNI) + letraDNI;
    }

    private char generaLetraDNI(int res) {

        char letras[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

        return letras[res];
    }

    // seters
    public void setnombre(String nombre) {

        this.nombre = nombre;

    }

    public void setedad(int edad) {

        this.edad = edad;

    }

    public void setsexo(char sexo) {

        this.sexo = sexo;

    }

    public void setpeso(double peso) {

        this.peso = peso;

    }

    public void setaltura(double altura) {

        this.altura = altura;

    }

    // ToString
    public String toString() {

        return nombre + " con DNI: " + DNI + ", mide: " + altura + ", pesa: " + peso + ", a la edad de " + edad
                + " anios";

    }

}
