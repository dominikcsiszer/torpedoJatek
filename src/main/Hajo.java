package main;

public class Hajo {
    private int[] pozicio = new int[3];

    public Hajo(int[] pozicio) {
        this.pozicio = pozicio;
    }
    
    public boolean talalat(int poz) {
        int i = 0, N = pozicio.length;
        while(i < N && !(pozicio[i] == poz))
            i++;
        
        return i < N;
    }
}
