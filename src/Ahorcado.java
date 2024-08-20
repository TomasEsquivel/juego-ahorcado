import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        //clase Scanner que nos permite que el usuario escriba.
        Scanner scanner = new Scanner(System.in);

        //Declaraciones y asignaciones de variables
        String palabaSecreta = "termo";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean estaAdivinada = false;

        //Array
        char[] letrasAdivinadas = new char[palabaSecreta.length()];

        //Estructura de control Iterativa: (FOR)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        //Estructura de control Iterativa: (WHILE)
        while (!estaAdivinada && intentos < intentosMaximos) {
            System.out.println("Palabra a adivinar: "+ String.valueOf(letrasAdivinadas) );

            System.out.println("Introduce una letra, por favor:");
            char letra = Character.toLowerCase(scanner.next().charAt(0));
            
            boolean letraCorrecta = false;

            for (int i = 0; i < palabaSecreta.length(); i++) {
                if (palabaSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("¡Incorrecto Te quedan "+ (intentosMaximos - intentos) + " intentos.");     
            }

            if(String.valueOf(letrasAdivinadas).equals(palabaSecreta)){
                estaAdivinada = true;
                System.out.println("¡Felicidades, has adivinado la palabra secreta: " + palabaSecreta);
            }
        }
        if(!estaAdivinada){
            System.out.println("¡Que pena te has quedado sin intentos!");
        } 
        scanner.close();
    }
    
}
