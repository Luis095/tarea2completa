/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea2p3;

/**
 *
 * @author LuisRaymundo
 */


import java.util.Scanner;

public class Tarea2p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz1 = { {1, 1, 0}, {2, 1, 1}, {-1, 1, -2} };
        int[][] matriz2 = { {0, 3, 4}, {1, -4, -5}, {-1, 3, 4} };
        int[][] result = new int[3][3];

        // Multiplicando
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        // imprimiendo el resultado
        System.out.println("El resultado de la Multiplicacion de las Matriz 1 y 2 es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        // boton de salida
        System.out.println("Precione el boton de enter para salir del programa...");
        sc.nextLine();
    }
}
