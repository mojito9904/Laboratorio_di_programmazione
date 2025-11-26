package Laboratorio_di_programmazione.Secondo_parziale.parziale_2021;

public class metodo {
    /*
    Scrivere un metodo statico iterativo che, dati un array bidimensionale di
    stringhe a, un array monodimensionale di caratteri c ed un intero k, restituisce true se in
    ogni riga a[i] esiste almeno una stringa il cui primo carattere `e uguale a c[i] e la cui lunghezza
    `e minore di k; altrimenti il metodo restituisce false.
    Esempio: se a = {{"abc","bb","d"},{"rkr","rc"},{"mp","aqsfg","ats","ar"}},
    c = {’b’,’r’,’a’}e k = 4, il metodo restituisce true.
    Si assuma che gli array a e c abbiano lunghezza uguale, che ogni stringa in a sia non vuota
    e k > 0.
    N.B. i) Occorre passare alla riga successiva non appena si trova in a[i] la prima stringa che
    soddisfa la condizione data.
    ii) Occorre restituire false non appena si trova la prima riga a[i] che non soddisfa la condizione
    richiesta.
     */
    public static boolean metodo1(String[][] a,char[] c,int k){
        for (int i = 0; i < a.length; i++) {
            int j=0;
            boolean found=false;
            while(j<a[i].length && !found){
                if(a[i][j].length()<k && a[i][j].charAt(0)==c[i]){
                    found=true;
                }
                else{
                    j++;
                }
            }
            if(!found){
                return false;
            }
        }
        return true;
    }  
    /*
    Scrivere un metodo statico iterativo che, dati un array monodimensionale di
    stringhe a ed un array monodimensionale di caratteri c, restituisce un array monodimensio-
    nale di stringhe b tale che b[i] `e la stringa ottenuta da a[i] senza le occorrenze del carattere
    c[i].
    Esempio: se a = {"apqpwp","gwwg","jxxh","y","qq","rzrr"}e c = {’p’,’g’,’x’,’z’,
    ’q’,’r’}, il metodo restituisce l’array b = {"aqw","ww","jh","y","","z"}.
    Si assuma che gli array a e c abbiano lunghezza uguale.
     */
    public static String[] metodo2(String[]a,char[]c){
        String[] b=new String[a.length];
        String s;
        for (int i = 0; i < a.length; i++) {
            int j=0;
            s="";
            while(j<a[i].length()){
                if(!(a[i].charAt(j)==c[i])){
                    s+=a[i].charAt(j);
                }
                j++;
            }
            b[i]=s;
        }
        return b;
    }

    /*metodo ricorsivo */
    public static String[] metodo2_ricorsivo(String[]a,char[]c){
        String[] b=new String[a.length];
        return metodo2_ricorsivo(a, c,b,0,0,"");
    }

    public static String[] metodo2_ricorsivo(String[]a, char[]c,String[] b, int i,int j,String s){
        if(i==a.length) return b;
        if(j==a[i].length()) {
            b[i]=s;
            return metodo2_ricorsivo(a, c, b, i+1, 0, "");
        }
        if(!(a[i].charAt(j)==c[i])){
            s+=a[i].charAt(j);
            return metodo2_ricorsivo(a, c, b, i, j+1, s);
        }
        return metodo2_ricorsivo(a, c, b, i, j+1, s);
    }
}
