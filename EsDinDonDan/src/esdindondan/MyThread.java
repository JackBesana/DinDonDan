/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esdindondan;

import java.util.Scanner;

/**
 *
 * @author besan
 */
class MyThread extends Thread {
    private int count = 0;
    String suono;
    Scanner s = new Scanner(System.in);
    public int choice = 0;

    /**
     * @author besana_giacomo
     *
     * @brief Crea un oggetto MyThread che rappresenta una campana
     *
     * Crea una campana che riproduce il suono passato per parametro
     *
     *
     */
    MyThread(String suono) {
        this.suono = suono;
    }

    /**
     * @author besana_giacomo
     *
     * @brief Manda in esecuzione il Thread
     *
     * Esegue il thread. Durante l'esecuzione continua a stampare il suono della
     * campana
     */
    @Override
    public void run() {
        while (true) {
            if (choice != 0) {
                this.interrupt();
            }
            try {
                if (!this.isInterrupted()) {
                    System.out.println(suono);
                    count++;
                }
                Thread.yield();
                if(suono.equals("DIN")) {
                    sleep(1000);
                } else if(suono.equals("DON")){
                    sleep(2000);
                } else if(suono.equals("DAN")) {
                    sleep(3000);
            }
                
            } catch (InterruptedException e) {
                System.out.println("Thread " + suono + " interrotto.");
                return;
            }

        }
    }
    
    public int getCount() {
        return count;
    }
}
