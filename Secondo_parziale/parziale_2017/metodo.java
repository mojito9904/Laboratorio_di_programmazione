package Laboratorio_di_programmazione.Secondo_parziale.parziale_2017;

public class metodo {
    /* Scrivere un metodo che, dati un array bidimensionale di stringhe a ed un array
    monodimensionale di interi v, restituisce un array monodimensionale di stringhe b tale che b[i]
    e la concatenazione delle stringhe in a[i] (lette da sx a dx) la cui lunghezza e maggiore di v[i].
    Esempio: se a = "attf","jr","brw","acxf","","ytd","lp","z","abcd","rt"
    e v = 3,4,2 , il metodo restituisce b = "attfacxf","","abcd" .
    Si assuma che gli array a e v abbiano la stessa lunghezza. */
    public static String[] metodo1(String [][]a, int []v){
        String [] b=new String [a.length];
        for(int i=0;i<a.length;i++){
            String s="";
            for (int j = 0; j <a[i].length; j++) {
                if(a[i][j].length()>v[i]){
                    s+=a[i][j];
                }
            }
            b[i]=s;
        }
        return b;
    }

    /*Metodo 1 ma con la ricorsioni */
    public static String [] metodo1_ricorsivo(String [][]a,int []v){
        String [] b=new String[a.length];
        return metodo1_ricorsivo(a, v,b,0,0,"");
    }
    public static String[] metodo1_ricorsivo(String [][]a, int[] v,String[] b,int i,int j,String s){
        if(i==a.length) return b;
        if(j==a[i].length){
            b[i]=s;
            return metodo1_ricorsivo(a, v, b, i+1, 0, "");
        }
        if(a[i][j].length()>v[i]){
            s+=a[i][j];
            return metodo1_ricorsivo(a, v, b, i, j+1, s);
        }
        return metodo1_ricorsivo(a, v, b, i, j+1, s);
    }

    /*
    Scrivere un metodo che, dati un array monodimensionale di stringhe a, un
    array monodimensionale di caratteri c ed un intero k, restituisce true se in ogni stringa a[i] di
    a esistono almeno k caratteri diversi da c[i], altrimenti il metodo restituisce false. Esempio:
    se a = "abbcd","ad","bffgh","jswf","frs" , c = b,h,f,w,a e k = 2, il
    metodo restituisce true.
    N.B. i) Occorre restituire false non appena si trova una stringa a[i] che non soddisfa la
    condizione richiesta. ii) Occorre passare alla stringa successiva non appena si veri ca che
    una stringa a[i] soddisfa la condizione richiesta. iii) Si assuma che gli array a e c abbiano la
    stessa lunghezza e k>0.
     */
    public static boolean metodo2(String []a,char[] c,int k){
        int cont;
        int j;
        for (int i = 0; i < a.length; i++) {
            j=0;
            cont=0;
            while(j<a[i].length() && cont<k){
                if(a[i].charAt(j)!=c[i]){
                    cont++;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }

    /*meodo precedente ma ricorsivo */
    public static boolean metodo2_ricorsivo(String []a,char[] c,int k){
        return metodo2_ricorsivo(a,c,k,0,0,0);
    }
    public static boolean metodo2_ricorsivo(String []a,char[] c,int k,int i, int j, int cont){
        if (i==a.length) return true;
        if(j==a[i].length()){
            if(cont>=k){
                return metodo2_ricorsivo(a, c, k, i+1, 0, 0);
            }
            else{
                return false;
            } 
        }
        if(a[i].charAt(j)!=c[i]){
                cont++;
                return metodo2_ricorsivo(a, c, k, i,j+1,cont);
            }
        return metodo2_ricorsivo(a, c, k, i, j+1, cont);
    }

    /*Scrivere un metodo che, dato un array monodimensionale di interi a, restituisce 
    un array bidimensionale di interi b tale che la riga b[i] contiene i numeri da 0 ad a[i] 
    se a[i] >=0, mentre b[i] contiene i numeri da a[i] a 0 se a[i]<0. Esempio: se a = 5,-4,-1,3 ,
    il metodo restituisce l'array b = 0,1,2,3,4,5,-4,-3,-2,-1,0,-1,0,0,1,2,3  */
    public static int [][] metodo3(int[] a) {
    int[][] b=new int[a.length][];
    for (int i=0;i<a.length;i++) {
        if (a[i]>=0) {
            b[i]=new int[a[i]+1]; 
            for (int j=0;j<=a[i];j++) {
                b[i][j]=j;
            }
        } else {
            b[i]=new int[-a[i]+1]; 
            for (int j=0;j<= -a[i];j++) {
                b[i][j]=a[i]+j;
            }
        }
    }
    return b;
    }

}
