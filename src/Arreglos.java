import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args){
        int[] numeros =new int [3];
        numeros[0]=1;
        numeros[1]=2;



        numeros[2]=-1;



        int i = numeros[0];
        int j = numeros[1];

        int k = numeros[numeros.length-1];

        System.out.println("i= "+i);
        System.out.println("j= "+j);
        System.out.println("j= "+k);

        String[] productos = new String[3];
        productos[0]="Memoria";
        productos[1]="Samsung S2-3";
        productos[2]="Airpods";


        for( i = 0; i <= 3 ; i ++) System.out.println(productos);


        Arrays.sort(productos);


        System.out.println("productos[0] ="+ productos[0]);


    }
}