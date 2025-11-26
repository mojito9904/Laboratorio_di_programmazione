package Laboratorio_di_programmazione.Secondo_parziale.parziale_2022;

public class Main {
    public static void main(String args[]) {

        /* ============================================================
         *                     MAIN PER METODO 1
         * ============================================================
         * Test del metodo metodo1():
         * - Verifica se tutte le stringhe di ogni riga iniziano con il
         *   carattere corrispondente nel vettore c.
         *
         * Esempio commentato:
         *
         * String [][] a = {
         *     {"adb", "dt", "dir"},
         *     {"jr",  "jgt"},
         *     {"fx",  "f", "gif", "fy"}
         * };
         *
         * char[] c = {'d', 'j', 'f'};
         *
         * boolean [] b = metodo.metodo1(a, c);
         *
         * for (int i = 0; i < b.length; i++) {
         *     System.out.println(b[i]);   // stampa true/false per ogni riga
         * }
         */


        /* ============================================================
         *                     MAIN PER METODO 2 (ITERATIVO)
         * ============================================================
         * Test del metodo metodo2():
         * - Ogni elemento di b è la concatenazione delle prime v[i]
         *   stringhe lunghe almeno k presenti nella riga a[i].
         * - Se tali stringhe NON esistono, b[i] diventa "**".
         *
         * Esempio commentato:
         *
         * String[][] a = {
         *     {"ops", "t", "cr7", "yr"},
         *     {"qr", "y5", "g"},
         *     {"FM3", "k", "zk"}
         * };
         *
         * int[] v = {2, 3, 2};
         * int k = 2;
         *
         * String[] b = metodo.metodo2(a, v, k);
         *
         * for (int i = 0; i < b.length; i++) {
         *     System.out.println(b[i]);
         * }
         */

        /* ============================================================
         *                  MAIN PER METODO 2 (RICORSIVO)
         * ============================================================
         * Stesso test di sopra, ma usando la versione ricorsiva:
         *
         * String[][] a = {
         *     {"ops", "t", "cr7", "yr"},
         *     {"qr", "y5", "g"},
         *     {"FM3", "k", "zk"}
         * };
         *
         * int[] v = {2, 3, 2};
         * int k = 2;
         *
         * String[] b = metodo.metodo2_ricorsivo(a, v, k);
         *
         * for (int i = 0; i < b.length; i++) {
         *     System.out.println(b[i]);
         * }
         */


        /* ============================================================
         *                     MAIN PER METODO 3
         * ============================================================
         * Test del metodo metodo3():
         * - Restituisce una matrice di caratteri dove:
         *      'y' = l’elemento è divisibile per b[i]
         *      'n' = altrimenti
         */
        /* 
        int[][] a = {
            {12, -1},
            {-7, 9, 3, 8},
            {5, 10, 3}
        };

        int[] b = {4, 3, 2};

        char[][] c = metodo.metodo3(a, b);

        // Stampa della matrice risultante
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.println(c[i][j]);
            }
            System.out.println(); // Riga vuota per separare le righe della matrice
        }
        */
    }
}
