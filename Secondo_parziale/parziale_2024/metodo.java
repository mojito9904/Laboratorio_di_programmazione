package Laboratorio_di_programmazione.Secondo_parziale.parziale_2024;
public class metodo {
    /*
    Scrivere un metodo statico iterativo che, dati un array monodimensionale di
    stringhe a ed un intero k, restituisce true se ogni stringa a[i] di a contiene almeno k coppie
    di caratteri adiacenti uguali, altrimenti il metodo restituisce false.
    Esempio: se a = {"abbcddfff","pppprrx","yffggyy"} e k = 3, il metodo restituisce true.
    Si assuma k > 0.
    N.B. i) Occorre passare alla stringa successiva non appena si verifica che una stringa a[i]
    soddisfa la condizione richiesta. ii) Occorre restituire false non appena si trova la prima
    stringa a[i] che non soddisfa la condizione richiesta. */

    public static boolean metodo1(String [] a, int k){
        int n;
        int j;
        for (int i=0;i<a.length;i++){
            j=0;
            n=0;
            while(j<a[i].length()-1 && n<k){
                if(a[i].charAt(j)==a[i].charAt(j+1)){
                    n++;
                }
                j++;
            }
            if(n<k){
                return false;
            }
        }
        return true;

    }



    /*Scrivere un metodo statico iterativo che, dati un array bidimensionale di
    stringhe a ed un array monodimensionale di interi b, restituisce un array monodimensionale
    di stringhe c tale che c[i] `e la stringa ottenuta concatenando le stringhe nella riga a[i] (letta
    da sx a dx) la cui lunghezza `e uguale a b[i]. Se in a[i] non esiste alcuna stringa che soddisfa
    tale condizione, allora c[i] `e la stringa "//".
    Esempio: se a = {{"qwr","g","t5y",""},{"v","kkj"},{"x","tj2y","vx","wrkr","y"}}
    e b = {3,2,4}, il metodo restituisce l’array c = {"qwrt5y","//","tj2ywrkr"}.
    Si assuma che le lunghezze degli array a e b siano uguali e b[i] > 0 per ogni i.
    N.B. Non occorre contare le stringhe che soddisfano la condizione richiesta. */

    public static String[] metodo2(String [][]a,int []b){
        String[] c=new String[a.length];
        String s;
        for(int i=0;i<a.length;i++){
            s="";
            for(int j=0;j<a[i].length;j++){
                if(a[i][j].length()==b[i]){
                    s+=a[i][j];
                }
            }
            if(s.equals("")){
                c[i]="//";
            }
            else{
                c[i]=s;
            }

        }
        return c;
    }

    /*Stesso codice però fatto in modom ricorsivo */
public static String[] metodo2_ricorsivo(String [][]a,int []b){
    String[] c=new String[a.length];
    return metodo2_ricorsivo(a, b,c,0,0,"");
}

public static String[] metodo2_ricorsivo(String[][]a,int []b, String []c,int i, int j,String s){
    if(i==a.length) return c;
    if(j==a[i].length){
        if(s.equals("")){
            c[i]="//";
            return metodo2_ricorsivo(a, b, c, i+1, 0, "");
        }
        else {
            c[i]=s;
            return metodo2_ricorsivo(a, b, c, i+1, 0, "");
        }
    }
    if(a[i][j].length()==b[i]){
        s+=a[i][j];
        return metodo2_ricorsivo(a, b, c, i, j+1, s);
    }
    else return metodo2_ricorsivo(a, b, c, i, j+1, s);
}

    /*Scrivere un metodo statico iterativo che, dati un array bidimensionale di
    stringhe a ed un array monodimensionale di interi b, restituisce un array bidimensionale di
    caratteri c tale che, per ogni i e j, il carattere c[i][j] della riga c[i] `e il carattere della stringa
    a[i][j] in posizione b[i], se tale posizione esiste; altrimenti c[i][j] `e il carattere ’-’.
    Esempio: se a = {{"ab","pippo"},{"oggi","ops","oh"},{"pianta","fiore","blu",
    "albero"}} e b = {3,2,4}, il metodo restituisce l’array
    c = {{’-’,’p’},{’g’,’s’,’-’},{’t’,’e’,’-’,’r’}}. */

public static char [][] metodo3(String [][]a, int []b){
    char[][] c=new char[a.length][];
    for(int i=0;i<a.length;i++){
        c[i]=new char[a[i].length];
        for(int j=0;j<a[i].length;j++){
            if(a[i][j].length()>b[i]){
                c[i][j]=a[i][j].charAt(b[i]);
            }
            else{
                c[i][j]='-';
            }
             
        }
    }
    return c;

}
}