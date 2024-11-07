import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListaArreglos {
    public static void main(String[] args) {
        List<String> listaColores = new ArrayList<>();

        String[] nombres = {"Arturo","Daniel","Pamela"};
        List<String>listaNombres = Arrays.asList(nombres);


        listaColores.add("Verde");
        listaColores.add("Amarillo");

        List<String> listaElementos = new ArrayList<>(listaColores);
        listaElementos.addAll(listaNombres);
        System.out.println("Lista Nombre: ");
        listaNombres.forEach(System.out::println);
        System.out.println("Lista Colores: ");
        listaColores.forEach(System.out::println);
        System.out.println("lista Elementos ");
        listaElementos.forEach(System.out::println);


        ListIterator<String> iterator1 = listaColores.listIterator();
        System.out.println("Recorrido con iterador hacia adelante");
        while(iterator1.hasNext()){
            System.out.println("Color: "+ iterator1.next());

        }

        System.out.println("Recorrido con iterador hacia atras");
        while(iterator1.hasPrevious()){
            System.out.println("Color: "+iterator1.previous());
        }

        ListIterator<String> iterator2 = listaElementos.listIterator();
        System.out.println("Recorrido con iterador hacia adelante");
        while(iterator2.hasNext()){
            System.out.println("Elementos:  "+ iterator2.next());
        }

        System.out.println("Recorrido con iterador hacia atras");
        while(iterator2.hasPrevious()) {
            System.out.println("Elementos: " + iterator2.previous());
        }


        System.out.println("Recorrido con iterador eliminacion dinamica");
        while(iterator1.hasNext()){
            if (iterator1.next().equals("Amarillo"){
                iterator1.remove();
            }
        }







    }

}

