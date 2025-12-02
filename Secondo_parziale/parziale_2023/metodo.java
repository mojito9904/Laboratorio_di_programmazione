package Laboratorio_di_programmazione.Secondo_parziale.parziale_2023;

public class metodo {

    /*
   Scrivere un metodo statico iterativo che, dato un array bidimensionale di
stringhe a, restituisce true se esiste almeno una riga a[i] tale che le stringhe in a[i] (letta da
sx a dx) hanno lunghezze strettamente decrescenti, altrimenti il metodo restituisce false.
Esempio: se a = {{"bk","x","jrw"},{"h5mvc","qkw","fp","z"},{"t3qw","zq"}},
il metodo restituisce true.
N.B. i) Occorre passare alla riga successiva non appena si verifica che le stringhe in a[i] non
soddisfano la condizione richiesta. ii) Occorre restituire true non appena si trova la prima
riga a[i] che soddisfa la condizione richiesta. 
     */

    public static boolean metodo1(String [][]a){
        boolean trovato=true;
        for (int i=0;i<a.length;i++){
            trovato=true;
            int j=0;
            while(j<a[i].length-1 && trovato){
                if(!(a[i][j].length()>a[i][j+1].length())){
                    trovato=false;
                }
                j++;
            }
            if(trovato) return trovato;
        }
        return trovato;
    }  


    /* 
       Esercizio 2. Scrivere un metodo statico iterativo che, dati due array monodimensionali di
    stringhe a e c ed un intero k, restituisce un array monodimensionale di booleani b tale che
    b[i] vale true se la stringa a[i] compare almeno k volte in c, altrimenti b[i] vale false.
    Esempio: se a = {"cd","ab","ghr"}, c = {"ghr","ab","yrt","ab","cd","ghr","ab"}e
    k = 2, il metodo restituisce l’array b = {false,true,true}.
    Si assuma che il valore di k sia strettamente positivo.
    N.B. Occorre passare alla stringa successiva non appena si verifica che a[i] soddisfa la con-
    dizione richiesta.
    */


    public static boolean [] metodo2 (String [] a, String[]c, int k){
        boolean [] b= new boolean [a.length];
        int cont;
        int j;
        for (int i=0;i<a.length;i++){
            cont=0;
            j=0;
            while(j<c.length && cont<k){
                if(a[i].equals(c[j])){
                    cont++;
                }
                j++;
            }
            if(cont==k){
                b[i]=true;
            }
            else{
                b[i]=false;
            }
        }
        return b;
    }


    public static boolean[] metodo2_ricorsivo (String[]a,String[]c,int k){
        boolean b[]=new boolean[a.length];
        return metodo2_ricorsivo(a, c, k,b,0,0,0);
    }
    public static boolean[] metodo2_ricorsivo(String[] a,String[]c,int k, boolean[]b ,int i,int j,int cont){
        if(i==a.length) return b;
        if(j==c.length || cont==k){
            if (cont==k){
                b[i]=true;
                return metodo2_ricorsivo(a, c, k, b, i+1, 0, 0);
            }
            else{
                b[i]=false;
                return metodo2_ricorsivo(a, c, k, b, i+1, 0, 0);
            }
        }
        if(a[i].equals(c[i])){
            cont++;
            
        }
        return metodo2_ricorsivo(a, c, k, b, i, j+1, cont);
    }


}

    /*
 

    

Esercizio 3. Scrivere una versione ricorsiva del metodo definito per risolvere l’Esercizio 2
(incluso il requisito del suo N.B.).
Esercizio 4. Scrivere un metodo statico iterativo che, dati un array monodimensionale di
stringhe a ed una stringa s, restituisce un array bidimensionale di stringhe b tale che la riga
b[i] contiene le stringhe ottenute concatenando i caratteri della stringa a[i] (letta da sx a dx)
con la stringa s.
Esempio: se a = {"bncz","as","rvc"}ed s = "ulla", il metodo restituisce l’array
b = {{"bulla","nulla","culla","zulla"},{"aulla","sulla"},{"rulla","vulla",
"culla"}}.
    */ 