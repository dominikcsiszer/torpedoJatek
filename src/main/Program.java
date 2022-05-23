package main;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        System.out.println("Torpedó játék");
        
        int[] hajoPozicio = new int[3];
        int randomPoz = (int)(Math.random() * 5);
        hajoPozicio[0] = randomPoz;
        hajoPozicio[1] = randomPoz + 1;
        hajoPozicio[2] = randomPoz + 2;
        Hajo hajo = new Hajo(hajoPozicio);
        
        int lovesekSzama = 0, talalatokSzama = 0;
        boolean sullyedt = false;
        do {
            Scanner s = new Scanner(System.in);
            System.out.print("helye ");
            int tipp = s.nextInt();
            if(hajo.talalat(tipp)) {
                System.out.println("talált");
                talalatokSzama++;
            } else {
                System.out.println("mellé");
            }
            lovesekSzama++;
            sullyedt = talalatokSzama == 3;
        }
        while(!sullyedt);
        System.out.printf("A hajó elsüllyedt %d találatból. \n",lovesekSzama);
    }
    
}
