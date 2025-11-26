package Laboratorio_di_programmazione.Secondo_parziale.parziale_2017;

public class Main {
    public static void main(String arg[]){

        /* ============================================================
           MAIN PER IL PRIMO METODO (versione iterativa, non ricorsiva)
           ============================================================ */
        /*
        // Array bidimensionale di stringhe
        String [][] a = {
            {"attf","jr","brw","acxf"},
            {"","ytd","lp"},
            {"z","abcd","rt"}
        };
        // Array dei limiti di lunghezza
        int[] v = {3,4,2};
        // Chiamata del metodo
        String [] b = metodo.metodo1(a, v);
        // Stampa del risultato
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        */

        /* ============================================================
           MAIN PER IL PRIMO METODO (versione ricorsiva)
           ============================================================ */
        /*
        String [][] a = {
            {"attf","jr","brw","acxf"},
            {"","ytd","lp"},
            {"z","abcd","rt"}
        };
        int[] v = {3,4,2};
        String [] b = metodo.metodo1_ricorsivo(a, v);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        */

        /* ============================================================
           MAIN PER IL SECONDO METODO (versione iterativa)
           ============================================================ */
        /*
        String[] a = {"abbcd","ad","bffgh","jswf","frs"};
        char[] c   = {'b','h','f','w','a'};
        int k = 2;
        // Stampa true se ogni stringa ha almeno k caratteri != c[i]
        System.out.println(metodo.metodo2(a, c, k));
        */

        /* ============================================================
           MAIN PER IL SECONDO METODO (versione ricorsiva)
           ============================================================ */
        /*
        String[] a = {"abbcd","ad","bffgh","jswf","frs"};
        char[] c   = {'b','h','f','w','a'};
        int k = 2;
        // Stessa logica del metodo sopra, ma implementata ricorsivamente
        System.out.println(metodo.metodo2_ricorsivo(a, c, k));
        */

        /* ============================================================
           MAIN PER IL TERZO METODO
           ============================================================ */
        /*
        int[] a = {5, -4, -1, 3};
        int[][] b = metodo.metodo3(a);
        // Stampa il contenuto della matrice risultato
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(); // Va a capo dopo ogni riga
        }
        */

    }
}
