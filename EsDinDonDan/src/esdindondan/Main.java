/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esdindondan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author besan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    /**
     * @author besana_giacomo
     *
     * @brief Classe che riproduce il suono di tre campane
     *
     * Riproduce il funzionamento di tre campane tramite tre thread eseguiti in
     * parallelo.
     *
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        DatiCondivisi dati = new DatiCondivisi();
        MyThread t1 = new MyThread("DIN");
        MyThread t2 = new MyThread("DON");
        MyThread t3 = new MyThread("DAN");
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        
        int scelta;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Inserisci la previsaione: ");
        String prev = console.readLine();
        
        t1.start();
        t2.start();
        t3.start();
        scelta = s.nextInt();
        if (scelta == 1) {
            t1.choice = 1;
            dati.setNumDin(t1.getCount());
            t2.choice = 1;
            dati.setNumDon(t2.getCount());
            t3.choice = 1;
            dati.setNumDan(t3.getCount());
            System.out.println("programma terminato");
            dati.vincita(prev);
            System.out.println(dati.toString());
        }

    }

}
