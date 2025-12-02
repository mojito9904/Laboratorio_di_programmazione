package Laboratorio_di_programmazione.Secondo_parziale.parziale_2023;

public class Main {
    public static void main(String args[]) {

        /* ============================================================
         *                     MAIN PER METODO 1
         * ============================================================
         * Test del metodo metodo1():
         * - Controlla se esiste almeno una riga dell’array bidimensionale
         *   le cui stringhe, lette da sinistra verso destra, hanno
         *   lunghezze strettamente decrescenti.
         *
         * Esempio commentato:
         *
         * String[][] a = {
         *     {"bk", "x", "jrw"},
         *     {"h5mvc", "qkw", "fp", "z"},
         *     {"t3qw", "zq"}
         * };
         *
         * System.out.println(metodo.metodo1(a));
         */

        String[][] a = {
            {"bk", "x", "jrw"},
            {"h5mvc", "qkw", "fp", "z"},
            {"t3qw", "zq"}
        };
        System.out.println(metodo.metodo1(a));


        /* ============================================================
         *                     MAIN PER METODO 2 (ITERATIVO)
         * ============================================================
         * Test del metodo metodo2():
         * - b[i] vale true se la stringa a[i] compare almeno k volte
         *   all’interno dell’array c.
         * - Altrimenti b[i] vale false.
         *
         * Esempio commentato:
         *
         * String[] a = {"cd", "ab", "ghr"};
         * String[] c = {"ghr", "ab", "yrt", "ab", "cd", "ghr", "ab"};
         * int k = 2;
         *
         * boolean[] b = metodo.metodo2(a, c, k);
         *
         * for (int i = 0; i < b.length; i++)
         *     System.out.println(b[i]);
         */
        /*
        String[] a2 = {"cd", "ab", "ghr"};
        String[] c2 = {"ghr", "ab", "yrt", "ab", "cd", "ghr", "ab"};
        int k = 2;

        boolean[] b2 = metodo.metodo2(a2, c2, k);

        for (int i = 0; i < b2.length; i++) {
            System.out.println(b2[i]);
        }
        */


        /* ============================================================
         *                MAIN PER METODO 2 (RICORSIVO)
         * ============================================================
         * Versione ricorsiva dello stesso esercizio del metodo 2.
         *
         * String[] a = {"cd", "ab", "ghr"};
         * String[] c = {"ghr", "ab", "yrt", "ab", "cd", "ghr", "ab"};
         * int k = 2;
         *
         * boolean[] b = metodo.metodo2_ricorsivo(a, c, k);
         *
         * for (int i = 0; i < b.length; i++)
         *     System.out.println(b[i]);
         */
        /*
        String[] a3 = {"cd", "ab", "ghr"};
        String[] c3 = {"ghr", "ab", "yrt", "ab", "cd", "ghr", "ab"};
        int k3 = 2;

        boolean[] b3 = metodo.metodo2_ricorsivo(a3, c3, k3);

        for (int i = 0; i < b3.length; i++) {
            System.out.println(b3[i]);
        }
        */


        /* ============================================================
         *                     MAIN PER METODO 3
         * ============================================================
         * Test del metodo metodo3():
         * - Per ogni stringa dell’array a, crea una riga di nuove stringhe,
         *   ognuna ottenuta concatenando ogni singolo carattere di a[i]
         *   con la stringa s.
         *
         * Esempio commentato:
         *
         * String[] a = {"bncz", "as", "rvc"};
         * String s = "ulla";
         *
         * Risultato atteso:
         * {
         *     {"bulla", "nulla", "culla", "zulla"},
         *     {"aulla", "sulla"},
         *     {"rulla", "vulla", "culla"}
         * }
         */
        /*
        String[] a4 = {"bncz", "as", "rvc"};
        String s = "ulla";

        String[][] b4 = metodo.metodo3(a4, s);

        for (int i = 0; i < b4.length; i++) {
            for (int j = 0; j < b4[i].length; j++) {
                System.out.print(b4[i][j] + " ");
            }
            System.out.println();
        }
        */
    }
}
