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

    public class MiHilo implements Runnable {
    String nombreHilo;
    public MiHilo(String nombre){
    nombreHilo=nombre;
    }
    //Punto de entrada del hilo
    //Los hilos comienzan a ejecutarse aquí
    public void run(){
    System.out.println("Comenzando "+nombreHilo);
    try {
    for (int contar=0; contar<10; contar++){
    Thread.sleep(400);
    System.out.println("En "+nombreHilo+", el recuento "+contar);
    }
    }catch (InterruptedException exc){
    System.out.println(nombreHilo + "Interrumpido.");
    }
    System.out.println("Terminando "+nombreHilo);
    }
}
class UsoHilos{
    public static void main(String[] args) {
    System.out.println("Hilo principal iniciando.");
    //Primero, construye un objeto unHilo.
    MiHilo mh=new MiHilo("#1");
    //Luego, construye un hilo de ese objeto.
    Thread nuevoHilo=new Thread(mh);
    //Finalmente, comienza la ejecución del hilo.
    nuevoHilo.start();
    for (int i=0; i<50;i++){
    System.out.print(" .");
    }try{
    Thread.sleep(100);
    }catch (InterruptedException exc){
    System.out.println("Hilo principal interrumpido.");
    }
    System.out.println("Hilo principal finalizado.");
}
}

