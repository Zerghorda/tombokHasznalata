package tombokhasznalata;

public class TombokHasznalata {

    public static void main(String[] args) {
        //pyLista = ["egy","kettő","három"];
        String[] tomb = {"egy", "kettő", "három"};
        System.out.println("tomb = " + tomb);
        for (int i = 0; i < tomb.length; i++) {
            System.out.printf("[%d. index] = %s\n", i, tomb[i]);
        }
        System.out.println();
        tomb = new String[4];
        for (int i = 0; i < tomb.length; i++) {
            System.out.printf("[%d. index] = %s\n", i, tomb[i]);
        }
        System.out.println();
        tomb[0] = "zero";
        tomb[1] = "one";
        tomb[2] = "two";
        tomb[3] = "three";

        for (int i = 0; i < tomb.length; i++) {
            System.out.printf("[%d. index] = %s\n", i, tomb[i]);
        }
        System.out.println();
        String[] nev = {"Gergő", "Matyi", "Marci"};
        int[] kor = {21, 23, 40};
        for (int i = 0; i < nev.length; i++) {
            System.out.printf("%s %d éves\n", nev[i], kor[i]);
        }
        int ossz = 0;
        for (int i = 0; i < kor.length; i++) {
            ossz += kor[i]; 
        }
        double atlag = (double)ossz/kor.length;
        System.out.printf("Átlag évkor: %.2f\n",atlag);
    }

}
