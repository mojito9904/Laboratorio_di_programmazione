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
    
}
