package Laboratorio_di_programmazione.Secondo_parziale.parziale_2022;
public class metodo{
    /*
    Scrivere un metodo statico iterativo che, dati un array bidimensionale di
    stringhe a ed un array monodimensionale di caratteri c, restituisce un array monodimen-
    sionale di booleani b tale che b[i] vale true se tutte le stringhe nella riga a[i] hanno c[i] come
    primo carattere, altrimenti b[i] vale false.
    Esempio: se a = {{"adb","dt","dir"},{"jr","jgt"},{"fx","f","gif","fy"}}e
    c = {’d’,’j’,’f’}, il metodo restituisce l’array b = {false,true,false}.
    Si assuma che le lunghezze di a e c siano uguali e che ogni stringa in a sia non vuota.
    N.B. Occorre passare alla riga successiva non appena si trova in a[i] la prima stringa che
    non soddisfa la condizione data
     */
    public static boolean [] metodo1(String[][] a, char[]c){
        boolean[] b= new boolean[a.length];
        boolean controllo;
        for (int i = 0; i < a.length; i++) {
            controllo=true;
            int j=0;
            while(j<a[i].length && controllo ){
                if(!(a[i][j].charAt(0) ==c[i])) {
                    controllo=false;
                }
                else{
                    j++;
                }
                
            }
            b[i]=controllo;
        }
        return b;
    }
}