package Kata_15Abril;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Kata: Crea un programa que detecte cuando el famoso "Código Konami"
         * se ha introducido correctamente desde el teclado.
         * Si sucede esto, debe notificarse mostrando un mensaje en la terminal. */

        // Código Konami: 'Arriba, arriba, abajo, abajo, izquierda, derecha, izquierda, derecha, B, A, Start'.

        Scanner sc = new Scanner(System.in);
        String[] lista = new String[11];

        String[] konami = {"Arriba", "arriba", "abajo", "abajo", "izquierda", "derecha",
                "izquierda", "derecha", "B", "A", "Start"};

        int contador = 0;

        do {
            System.out.println("Introduce algo por teclado:");
            String teclado = sc.nextLine();
            if (teclado.equalsIgnoreCase(konami[contador])) {
                lista[contador] = teclado;
                contador++;
            } else {
                contador = 0;
            }
        } while (lista[10] == null || lista[10].isEmpty() || lista[10].isBlank());

        System.out.println("¡Felicidades! Has introducido el Código Konami.");
    }
}
