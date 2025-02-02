/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sincronizacionHilos;

/**
 *
 * @author javmir
 */
public class Sumatorio extends Thread {

    private int numero;
    private double total = 0;

    public Sumatorio(int numero) {
        this.numero = numero;
    }

    @Override
    public void run() {
        if (numero % 2 == 0) {
            numero = numero - 1;
        }

        for (int i = numero; i >= 1; i = i - 2) {
            total += i;
        }
    }

    public double getTotal() {
        return total;
    }
}
