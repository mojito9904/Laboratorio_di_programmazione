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

    /*
    Scrivere un metodo statico iterativo che, dati un array bidimensionale di
    stringhe a, un array monodimensionale di interi v ed un intero k, restituisce un array mo-
    nodimensionale di stringhe b tale che b[i] `e la stringa ottenuta concatenando le prime v[i]
    stringhe nella riga a[i] (letta da sx a dx) la cui lunghezza `e maggiore o uguale a k. Se in a[i]
    non esistono tali v[i] stringhe, allora b[i] `e la stringa "**".
    Esempio: se a = {{"ops","t","cr7","yr"},{"qr","y5","g"},{"FM3","k","zk"}},
    v = {2,3,2}e k = 2, il metodo restituisce l’array b = {"opscr7","**","FM3zk"}.
    Si assuma che le lunghezze di a e v siano uguali e che i valori di v e di k siano strettamente
    positivi. N.B. Occorre passare alla riga successiva non appena si trovano in a[i] le v[i]
    stringhe che soddisfano la condizione richiesta.
     */
    public static String [] metodo2(String[][] a,int[]v,int k){
        String[] b=new String[a.length];
        String s;
        int j;
        int cont;
        for(int i=0;i<a.length;i++){
            j=0;
            cont=0;
            s="";
            while(j<a[i].length && cont<v[i] ){
                if(a[i][j].length()>=k){
                     s+=a[i][j];
                     cont++;
                }
                j++;
            }
            if(cont<v[i]){
                b[i]="**";
            }
            else {
                b[i]=s;
            }
        }
        return b;
    }
}