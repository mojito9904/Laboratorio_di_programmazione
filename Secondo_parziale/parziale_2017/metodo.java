package Laboratorio_di_programmazione.Secondo_parziale.parziale_2017;

public class metodo {

    /* Scrivere un metodo che, dati un array bidimensionale di stringhe a ed un array
       monodimensionale di interi v, restituisce un array monodimensionale di stringhe b tale che b[i]
       è la concatenazione delle stringhe in a[i] (lette da sx a dx) la cui lunghezza è maggiore di v[i].
       Esempio: se a = {"attf","jr","brw","acxf","","ytd","lp","z","abcd","rt"}
       e v = {3,4,2}  , il metodo restituisce b = {"attfacxf","","abcd"}.
       Si assume che a e v abbiano la stessa lunghezza.
    */
    public static String[] metodo1(String [][]a, int []v){
        // Array risultato con una stringa per ogni riga di 'a'
        String [] b = new String[a.length];

        for(int i = 0; i < a.length; i++){
            String s = "";  // Accumulatore delle stringhe valide nella riga i

            for (int j = 0; j < a[i].length; j++) {
                // Aggiunge la stringa solo se la lunghezza è > v[i]
                if(a[i][j].length() > v[i]){
                    s += a[i][j];
                }
            }

            b[i] = s;   // Inserisce la concatenazione nella posizione corretta
        }
        return b;
    }

    /* Metodo 1 ma ricorsivo */
    public static String [] metodo1_ricorsivo(String [][]a,int []v){
        // Array risultato da riempire ricorsivamente
        String [] b = new String[a.length];
        return metodo1_ricorsivo(a, v, b, 0, 0, "");
    }

    // Versione ricorsiva che scorre (i = riga, j = colonna)
    public static String[] metodo1_ricorsivo(String [][]a, int[] v, String[] b,
                                            int i, int j, String s){

        // Caso base: terminate tutte le righe → ritorna il risultato
        if(i == a.length) return b;

        // Se abbiamo terminato la riga corrente
        if(j == a[i].length){
            b[i] = s;  // Salva la stringa accumulata
            // Passa alla riga successiva (reset j e s)
            return metodo1_ricorsivo(a, v, b, i+1, 0, "");
        }

        // Se la stringa corrente va concatenata
        if(a[i][j].length() > v[i]){
            s += a[i][j]; // Aggiunge
        }

        // Continua sulla stessa riga incrementando j
        return metodo1_ricorsivo(a, v, b, i, j+1, s);
    }

    /*
       Scrivere un metodo che, dati un array di stringhe a, un array di caratteri c e un intero k,
       restituisce true se in ogni stringa a[i] esistono almeno k caratteri diversi da c[i].
       Altrimenti restituisce false.

       Note:
       - Restituire false appena una stringa non soddisfa la condizione.
       - Appena una stringa soddisfa la condizione si passa alla successiva.
    */
    public static boolean metodo2(String []a, char[] c, int k){
        int cont; // Contatore dei caratteri diversi da c[i]
        int j;

        for (int i = 0; i < a.length; i++) {
            j = 0;
            cont = 0;

            // Scorre la stringa finché non raggiunge k o la fine
            while(j < a[i].length() && cont < k){
                if(a[i].charAt(j) != c[i]){
                    cont++;
                }
                j++;
            }

            // Se cont < k allora la stringa a[i] non soddisfa la condizione
            if(cont < k){
                return false;
            }
        }

        return true; // Tutte le stringhe soddisfano la condizione
    }

    /* Metodo precedente ma ricorsivo */
    public static boolean metodo2_ricorsivo(String []a, char[] c, int k){
        return metodo2_ricorsivo(a, c, k, 0, 0, 0);
    }

    // i = indice della stringa, j = posizione nella stringa, cont = contatore caratteri != c[i]
    public static boolean metodo2_ricorsivo(String []a, char[] c, int k,
                                            int i, int j, int cont){

        // Sono state controllate tutte le stringhe
        if (i == a.length) return true;

        // Se siamo arrivati alla fine della stringa a[i]
        if(j == a[i].length()){
            // Se soddisfa la condizione passa alla successiva
            if(cont >= k){
                return metodo2_ricorsivo(a, c, k, i+1, 0, 0);
            }
            else{
                return false; // Non soddisfa la condizione → fallimento immediato
            }
        }

        // Se il carattere è diverso da c[i], incrementa cont
        if(a[i].charAt(j) != c[i]){
            cont++;
        }

        // Prosegue con il carattere successivo
        return metodo2_ricorsivo(a, c, k, i, j+1, cont);
    }

    /*
       Scrivere un metodo che, dato un array di interi a, restituisce un array bidimensionale b
       tale che:

       - Se a[i] >= 0   ⇒ b[i] contiene i numeri da 0 a a[i]
       - Se a[i] <  0   ⇒ b[i] contiene i numeri da a[i] a 0

       Esempio:
       a = {5, -4, -1, 3}
       b = {0,1,2,3,4,5},
           {-4,-3,-2,-1,0},
           {-1,0},
           {0,1,2,3}
    */
    public static int [][] metodo3(int[] a) {

        int[][] b = new int[a.length][];

        for (int i = 0; i < a.length; i++) {

            if (a[i] >= 0) {
                // Se positivo: lunghezza = a[i] + 1 (incluso)
                b[i] = new int[a[i] + 1];

                // Riempie da 0 a a[i]
                for (int j = 0; j <= a[i]; j++) {
                    b[i][j] = j;
                }

            } else {
                // Se negativo: lunghezza = |a[i]| + 1
                b[i] = new int[-a[i] + 1];

                // Riempie da a[i] a 0
                for (int j = 0; j <= -a[i]; j++) {
                    b[i][j] = a[i] + j;
                }
            }
        }

        return b;
    }
}

