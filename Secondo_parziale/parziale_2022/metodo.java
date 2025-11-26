package Laboratorio_di_programmazione.Secondo_parziale.parziale_2022;

public class metodo {

    /*
     * Metodo 1
     * Scrivere un metodo statico iterativo che, dati un array bidimensionale di
     * stringhe a ed un array monodimensionale di caratteri c, restituisce un array 
     * monodimensionale di booleani b tale che:
     * 
     *  b[i] = true  se TUTTE le stringhe nella riga a[i] hanno c[i] come primo carattere
     *  b[i] = false altrimenti
     *
     * Appena si trova una stringa che NON soddisfa la condizione, si passa alla riga successiva.
     *
     * Esempio:
     *  a = {{"adb","dt","dir"},{"jr","jgt"},{"fx","f","gif","fy"}}
     *  c = {'d','j','f'}
     *  Risultato: b = {false, true, false}
     *
     * Si assume che:
     *  - le lunghezze di a e c siano uguali
     *  - ogni stringa in a sia non vuota
     */
    public static boolean[] metodo1(String[][] a, char[] c) {
        boolean[] b = new boolean[a.length];
        boolean controllo;

        for (int i = 0; i < a.length; i++) {
            controllo = true; // ipotizzo che tutte vadano bene
            int j = 0;

            // Scorro la riga finché non trovo un errore
            while (j < a[i].length && controllo) {
                if (a[i][j].charAt(0) != c[i]) {
                    controllo = false; // prima stringa non valida → passo alla riga successiva
                } else {
                    j++;
                }
            }
            b[i] = controllo;
        }
        return b;
    }

    /*
     * Metodo 2 (iterativo)
     * Scrivere un metodo statico iterativo che, dati:
     *   - un array bidimensionale di stringhe a
     *   - un array di interi v
     *   - un intero k
     *
     * restituisce un array di stringhe b tale che:
     *
     *  b[i] = concatenazione delle prime v[i] stringhe di a[i]
     *         aventi lunghezza >= k
     *
     *  Se nella riga a[i] NON esistono almeno v[i] stringhe di lunghezza >= k,
     *  allora b[i] = "**".
     *
     * Appena si trovano le v[i] stringhe buone, si passa alla riga successiva.
     *
     * Esempio:
     *  a = {{"ops","t","cr7","yr"}, {"qr","y5","g"}, {"FM3","k","zk"}}
     *  v = {2,3,2}
     *  k = 2
     *  Risultato: {"opscr7", "**", "FM3zk"}
     *
     * Si assume che:
     *  - a.length == v.length
     *  - v[i] > 0 e k > 0
     */
    public static String[] metodo2(String[][] a, int[] v, int k) {
        String[] b = new String[a.length];
        String s;
        int j;
        int cont;

        for (int i = 0; i < a.length; i++) {
            j = 0;
            cont = 0;
            s = "";

            // Cerco le prime v[i] stringhe con lunghezza >= k
            while (j < a[i].length && cont < v[i]) {
                if (a[i][j].length() >= k) {
                    s += a[i][j];
                    cont++;
                }
                j++;
            }

            // Se non ne ho trovate abbastanza → "**"
            if (cont < v[i]) {
                b[i] = "**";
            } else {
                b[i] = s;
            }
        }
        return b;
    }

    /*
     * Metodo 2 (ricorsivo)
     * Versione ricorsiva del metodo precedente.
     */
    public static String[] metodo2_ricorsivo(String[][] a, int[] v, int k) {
        String[] b = new String[a.length];
        return metodo2_ricorsivo(a, v, k, b, 0, 0, 0, "");
    }

    public static String[] metodo2_ricorsivo(
        String[][] a, int[] v, int k,
        String[] b, int i, int j, int cont, String s
    ) {
        // Caso base: ho completato tutte le righe
        if (i == a.length) return b;

        // Caso in cui ho finito la riga o ho trovato abbastanza stringhe
        if (j == a[i].length || cont == v[i]) {
            if (cont < v[i]) {
                b[i] = "**";
            } else {
                b[i] = s;
            }
            // Passo alla riga successiva
            return metodo2_ricorsivo(a, v, k, b, i + 1, 0, 0, "");
        }

        // Caso ricorsivo: controllo la stringa corrente
        if (a[i][j].length() >= k) {
            s += a[i][j];
            cont++;
        }

        return metodo2_ricorsivo(a, v, k, b, i, j + 1, cont, s);
    }

    /*
     * Metodo 3
     * Scrivere un metodo statico iterativo che, dati:
     *
     *  - un array bidimensionale di interi a
     *  - un array monodimensionale di interi b
     *
     * restituisce un array bidimensionale di caratteri c tale che:
     *
     *  c[i][j] = 'y' se a[i][j] è divisibile per b[i]
     *  c[i][j] = 'n' altrimenti
     *
     * Esempio:
     *  a = {{12,-1}, {-7,9,3,8}, {5,10,3}}
     *  b = {4,3,2}
     *
     * Risultato:
     *  c = {{'y','n'}, {'n','y','y','n'}, {'n','y','n'}}
     *
     * Si assume:
     *  - a.length == b.length
     */
    public static char[][] metodo3(int[][] a, int[] b) {
        char[][] c = new char[a.length][];

        for (int i = 0; i < a.length; i++) {
            c[i] = new char[a[i].length];

            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] % b[i] == 0) {
                    c[i][j] = 'y';
                } else {
                    c[i][j] = 'n';
                }
            }
        }

        return c;
    }
}
