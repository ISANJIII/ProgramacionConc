/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionconcurrente;

/**
 *
 * @author cristopher.ovaillos
 */
public class ThreadEjemplo {

    public static void main(String[] args) {
        PruebaRunnable a = new PruebaRunnable();
        PruebaRunnable b = new PruebaRunnable();

        Thread mariaJose = new Thread(a, "Maria Jose");
        Thread joseMaria = new Thread(b, "Jose Maria");
        mariaJose.start();
        joseMaria.start();
        System.out.println("Termina thread main");
    }
}
