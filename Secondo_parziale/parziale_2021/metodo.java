package Laboratorio_di_programmazione.Secondo_parziale.parziale_2021;

public class metodo {

    /*
     Scrivere un metodo statico iterativo che, dati:
       - un array bidimensionale di stringhe a,
       - un array monodimensionale di caratteri c,
       - un intero k,

     restituisce true se PER OGNI RIGA a[i] esiste almeno UNA stringa
     che soddisfa contemporaneamente:

        1) il primo carattere è uguale a c[i]
        2) la lunghezza della stringa è minore di k

     Altrimenti restituisce false.

     NB:
       i) appena trovo la prima stringa valida nella riga, passo alla riga successiva
      ii) appena trovo una riga senza stringhe valide → false immediato

     Esempio:
     a = {{"abc","bb","d"}, {"rkr","rc"}, {"mp","aqsfg","ats","ar"}}
     c = {'b','r','a'}
     k = 4

     Il metodo restituisce true.
     */
    public static boolean metodo1(String[][] a, char[] c, int k) {

        // Scorro tutte le righe dell’array bidimensionale
        for (int i = 0; i < a.length; i++) {

            int j = 0;
            boolean found = false; // Indica se la condizione è soddisfatta per la riga i

            // Scorro la riga finché:
            // - ho stringhe da controllare
            // - non ho ancora trovato una stringa valida
            while (j < a[i].length && !found) {

                // Controllo:
                // 1) lunghezza < k
                // 2) primo carattere uguale a c[i]
                if (a[i][j].length() < k && a[i][j].charAt(0) == c[i]) {
                    found = true; // condizione soddisfatta → si passa alla riga successiva
                } else {
                    j++; // continuo a cercare nella riga
                }
            }

            // Se non ho trovato nessuna stringa valida per la riga i → fallimento immediato
            if (!found) {
                return false;
            }
        }

        // Tutte le righe hanno almeno una stringa che soddisfa la condizione
        return true;
    }



    /*
     Scrivere un metodo statico iterativo che, dati:
       - un array di stringhe a,
       - un array di caratteri c,

     restituisce un array di stringhe b tale che:

        b[i] = a[i] senza le occorrenze del carattere c[i]

     Esempio:
       a = {"apqpwp","gwwg","jxxh","y","qq","rzrr"}
       c = {'p','g','x','z','q','r'}

       b = {"aqw","ww","jh","y","","z"}

     Nota:
       Si assume che a e c abbiano la stessa lunghezza.
     */
    public static String[] metodo2(String[] a, char[] c) {

        String[] b = new String[a.length]; // array risultato
        String s; // stringa accumulata

        // Scorro tutte le stringhe dell’array a
        for (int i = 0; i < a.length; i++) {

            int j = 0;
            s = ""; // reset per la nuova stringa

            // Scorro la stringa a[i] carattere per carattere
            while (j < a[i].length()) {

                // Copio il carattere solo se è DIVERSO da c[i]
                if (a[i].charAt(j) != c[i]) {
                    s += a[i].charAt(j);
                }

                j++;
            }

            // Salvo la stringa modificata
            b[i] = s;
        }

        return b;
    }



    /* Versione ricorsiva del metodo 2 */
    public static String[] metodo2_ricorsivo(String[] a, char[] c) {
        String[] b = new String[a.length]; // risultato
        return metodo2_ricorsivo(a, c, b, 0, 0, "");
    }


    /*
      Parametri della ricorsione:
        - i → indice della stringa corrente in a[]
        - j → indice del carattere nella stringa a[i]
        - s → stringa accumulata senza il carattere c[i]
        - b → array risultato
     */
    public static String[] metodo2_ricorsivo(String[] a, char[] c, String[] b,
                                             int i, int j, String s) {

        // Caso base: ho elaborato tutte le stringhe
        if (i == a.length) return b;

        // Caso: fine della stringa a[i]
        if (j == a[i].length()) {
            b[i] = s; // salvo la stringa modificata
            // passo alla prossima stringa → reset j e s
            return metodo2_ricorsivo(a, c, b, i + 1, 0, "");
        }

        // Se il carattere è diverso da c[i], lo aggiungo a s
        if (a[i].charAt(j) != c[i]) {
            s += a[i].charAt(j);
        }

        // Chiamata ricorsiva sul carattere successivo
        return metodo2_ricorsivo(a, c, b, i, j + 1, s);
    }
}
