/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrevista;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Fibo {

    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int aux;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um número.");
        int escolha = sc.nextInt();

        for (int i = 0; i < escolha; i++) {
            System.out.println(a);
            aux = a;
            a = a + b;
            b = aux;
        }
    }
}
