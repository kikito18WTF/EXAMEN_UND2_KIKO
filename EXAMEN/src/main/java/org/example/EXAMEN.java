package org.example;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class EXAMEN {

    public  void ejercicio1 (){

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int numintro=0;
        int numeroaleatorio = aleatorio.nextInt(101);
        System.out.println(numeroaleatorio);
        boolean error = true;
        System.out.println("Acabo de pensar un número [0-100]… ¿puedes adivinarlo? ¡Tienes 10 intentos!");
        while (error){
            try {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Intento " + i + ". Introduce un numero:");
                    numintro = entrada.nextInt();


                    if (numintro < numeroaleatorio) {
                        System.out.println("Tu numero es menor al que he pensado");

                    }

                    if (numintro > numeroaleatorio) {
                        System.out.println("Tu numero es mayor al que he pensado");

                    }

                    if (numintro == numeroaleatorio) {
                        System.out.println("!Has acertado!. El numero era " + numeroaleatorio);
                       error = false;
                    }
                }
            } catch (InputMismatchException e1) {
                System.out.println("ERROR de caracteres");
                entrada.nextLine();
            }
        }
    }



    public void ejercicio2 (){

    }
}
