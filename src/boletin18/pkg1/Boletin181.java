
package boletin18.pkg1;

public class Boletin181 {

    public static void main(String[] args) {
        int [] numeros;
        numeros=new int [6];
        for (int i =0;i<numeros.length;i++){
            double random = Math.random()*50+1;
            int valor = (int) random;
            numeros[i]=valor;
            System.out.println(numeros[i]);
        }
    for (int i=numeros.length -1;i>=0;i--)
            System.out.println(numeros[i]);
    
    }
    
}
