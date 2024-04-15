package Kata_12Marzo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Kata: crear un método que cifre un String con el cifrado César o ROT13.

        Scanner sc = new Scanner(System.in);
        String frase = "";

        System.out.println("¡Hola! Introduce una frase, por favor: ");
        frase = sc.nextLine();
        System.out.println("Aquí tienes tu frase pasada a ROT13:\n" +
                toRot13(frase));

        sc.close();
    }

    public static String toRot13(String frase) {

        String[] rot13 = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        StringBuilder fraseRoteada = new StringBuilder();

        for (int i = 0; i < frase.length(); i++) {
            String charActual = Character.toString(frase.charAt(i));
            for (int j = 0; j < rot13.length; j++) {
                if (charActual.equalsIgnoreCase(rot13[j])) {
                    int contador = j + 13;
                    if (contador > rot13.length) {
                        contador = j - 13;
                    }
                    fraseRoteada.append(rot13[contador]);
                    break;
                }
            }
        }

        return fraseRoteada.toString();
    }
}


