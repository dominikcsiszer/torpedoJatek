package main;

public class TorpedoTeszt {
    public static void main(String[] args) {
        new TorpedoTeszt().tesztLoves(4);
        System.out.println("Teszt");
//        assert 3==5 : "Nem jó a találat ellenőrzése.";
    }
    
    public String tesztLoves(int poz) {
        int[] pozi = {2, 3, 4};
        Hajo hajo = new Hajo(pozi);
        String t = hajo.talalat(poz);
        assert t.equals("talált") : "Nem jó a találat ellenőrzés.";
        return "";
    }
}
