/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrevista;

import java.util.Scanner;


public class String {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inverter = sc.next();
        System.out.println(new StringBuilder(inverter).reverse().toString());

    }
}
