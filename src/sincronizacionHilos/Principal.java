/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sincronizacionHilos;

import java.util.Scanner;

/**
 *
 * @author javmir
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un primer numero para sumatorio");
        int numero1 = sc.nextInt();
        Sumatorio sum1 = new Sumatorio(numero1);

        System.out.println("Ingresa un segundo numero para sumatorio");
        int numero2 = sc.nextInt();
        Sumatorio sum2 = new Sumatorio(numero2);

        System.out.println("Ingresa un tercer numero para sumatorio");
        int numero3 = sc.nextInt();
        Sumatorio sum3 = new Sumatorio(numero3);

        sum1.start();
        sum2.start();
        sum3.start();

        try {
            sum1.join();
            sum2.join();
            sum3.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        

        double suma = sum1.getTotal() + sum2.getTotal() + sum3.getTotal();
        double formula = suma / 8;
        System.out.println("El resultado es: " + formula);
    }

}
