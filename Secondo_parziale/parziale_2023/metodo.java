package Laboratorio_di_programmazione.Secondo_parziale.parziale_2023;

public class metodo {

    /*
     * ===============================================================
     * ESERCIZIO 1
     * ---------------------------------------------------------------
     * Scrivere un metodo statico iterativo che, dato un array
     * bidimensionale di stringhe a, restituisce true se esiste almeno
     * una riga a[i] le cui stringhe (da sinistra a destra) hanno
     * lunghezze strettamente decrescenti.
     *
     * Esempio:
     * a = {
     *   {"bk","x","jrw"},
     *   {"h5mvc","qkw","fp","z"},
     *   {"t3qw","zq"}
     * }
     * Il metodo restituisce true perché la riga 0 rispetta la condizione.
     *
     * NOTE:
     * - Appena una coppia nella riga non rispetta la condizione → si passa
     *   alla riga successiva.
     * - Appena si trova una riga valida → si restituisce true.
     * ===============================================================
     */
    public static boolean metodo1(String [][] a){
        boolean trovato = true;

        // scorre ogni riga della matrice
        for (int i = 0; i < a.length; i++){
            trovato = true; // supponiamo sia valida la riga corrente

            int j = 0;
            // controlliamo le lunghezze a coppie consecutive
            while (j < a[i].length - 1 && trovato){
                if (!(a[i][j].length() > a[i][j+1].length())) {
                    trovato = false; // condizione violata
                }
                j++;
            }

            if (trovato) return true; // riga valida → true
        }

        return false; // nessuna riga valida
    }



    /*
     * ===============================================================
     * ESERCIZIO 2 (ITERATIVO)
     * ---------------------------------------------------------------
     * Dati due array di stringhe a e c e un intero k, restituisce un
     * array di booleani b dove:
     *
     * b[i] = true  se a[i] compare almeno k volte in c
     * b[i] = false altrimenti
     *
     * Esempio:
     * a = {"cd","ab","ghr"}
     * c = {"ghr","ab","yrt","ab","cd","ghr","ab"}
     * k = 2
     *
     * Risultato: b = {false, true, true}
     *
     * - La ricerca di ciascun elemento di a si ferma non appena
     *   compare k volte.
     * ===============================================================
     */
    public static boolean[] metodo2(String[] a, String[] c, int k){
        boolean[] b = new boolean[a.length];
        int cont;
        int j;

        for (int i = 0; i < a.length; i++){
            cont = 0;
            j = 0;

            // scorro c finché non arrivo alla fine OPPURE cont raggiunge k
            while (j < c.length && cont < k){
                if (a[i].equals(c[j])){
                    cont++;
                }
                j++;
            }

            b[i] = (cont == k); // true se ha raggiunto k occorrenze
        }

        return b;
    }



    /*
     * ===============================================================
     * ESERCIZIO 2 (RICORSIVO)
     * ---------------------------------------------------------------
     * Versione ricorsiva dell’esercizio precedente.
     * ===============================================================
     */
    public static boolean[] metodo2_ricorsivo(String[] a, String[] c, int k){
        boolean[] b = new boolean[a.length];
        return metodo2_ricorsivo(a, c, k, b, 0, 0, 0);
    }

    /*
     * Parametri ricorsivi:
     * - b : array dei risultati
     * - i : indice dell'array a (elemento corrente di a da cercare)
     * - j : indice dell'array c (posizione corrente nella ricerca)
     * - cont : conteggio delle occorrenze trovate per a[i]
     */
    public static boolean[] metodo2_ricorsivo(String[] a, String[] c, int k,
                                              boolean[] b, int i, int j, int cont){

        // caso base: abbiamo elaborato tutte le stringhe di a
        if (i == a.length) return b;

        // se ho finito c oppure ho già trovato k occorrenze
        if (j == c.length || cont == k){

            // imposto il risultato per a[i]
            b[i] = (cont == k);

            // passo al prossimo elemento di a
            return metodo2_ricorsivo(a, c, k, b, i+1, 0, 0);
        }

        // CORRETTO: devo confrontare a[i] con c[j], non c[i]
        if (a[i].equals(c[j])) cont++;

        // continua a scorrere c
        return metodo2_ricorsivo(a, c, k, b, i, j+1, cont);
    }



    /*
     * ===============================================================
     * ESERCIZIO 4
     * ---------------------------------------------------------------
     * Dato un array a e una stringa s, restituisce una matrice b tale
     * che b[i] contiene tante stringhe quanti sono i caratteri di a[i].
     *
     * Ogni stringa è ottenuta prendendo il carattere a[i].charAt(j)
     * e concatenandolo con s.
     *
     * Esempio:
     * a = {"bncz","as","rvc"}
     * s = "ulla"
     *
     * Risultato:
     * b = {
     *   {"bulla","nulla","culla","zulla"},
     *   {"aulla","sulla"},
     *   {"rulla","vulla","culla"}
     * }
     * ===============================================================
     */
    public static String[][] metodo3(String[] a, String s){
        String[][] b = new String[a.length][];

        // per ogni stringa di a
        for (int i = 0; i < a.length; i++){
            b[i] = new String[a[i].length()]; // una cella per ogni carattere

            for (int j = 0; j < a[i].length(); j++){
                char c = a[i].charAt(j); // estraggo il singolo carattere
                b[i][j] = c + s;         // concateno il carattere con s
            }
        }

        return b;
    }

}
