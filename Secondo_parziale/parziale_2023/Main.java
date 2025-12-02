package Laboratorio_di_programmazione.Secondo_parziale.parziale_2023;

public class Main {
    public  static void main(String args[]){
        
        /*String[][] a = {{"bk","x","jrw"},{"h5mvc","qkw","fp","z"},{"t3qw","zq"}};
        System.out.println(metodo.metodo1(a));
        */
        /*String [] a = {"cd","ab","ghr"}; 
        String[] c = {"ghr","ab","yrt","ab","cd","ghr","ab"};
        int k = 2; //il metodo restituisce l’array b = {false,true,true}.
        boolean []b=metodo.metodo2_ricorsivo(a,c,k);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        */
        String[] a = {"bncz","as","rvc"};
        String s = "ulla";
        String [][]b=metodo.metodo3(a, s);
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
