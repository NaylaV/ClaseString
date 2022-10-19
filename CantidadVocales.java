import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CantidadVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdusca una frase: ");
        String cad = sc.nextLine();//leemos la cadena
        int cantidadVocales = 0;
        int Acontar = 0;
        int Econtar = 0;
        int Icontar = 0;
        int Ocontar = 0;
        int Ucontar = 0;
        int consonantes = 0;
        String letraMasRepetida = "";
        int cantidadRepetida = 0;

        //Transformamos la frase a una lista,
        //así podremos buscar las letras duplicadas con Collections
        List<String> textoList = Arrays.asList(cad.split(""));

        //iteramos mientras el indice sea menor al tamanio total de la cadena
        for (int i = 0; i < cad.length(); i++) {
            char car = cad.charAt(i); //obtenemos el caracter en la posicion i
            //si el caracter es igual a "a", "e", "i", "o", ó "u" entonces es vocal
            if (car == 'A' || car == 'E' || car == 'I' || car == 'O' || car == 'U') {
                cantidadVocales++;
            }
            switch (car) {
                case 'A':
                    Acontar = Acontar + 1;
                    break;
                case 'E':
                    Econtar = Econtar + 1;
                    break;
                case 'I':
                    Icontar = Icontar + 1;
                    break;
                case 'O':
                    Ocontar = Ocontar + 1;
                    break;
                case 'U':
                    Ucontar = Ucontar + 1;
                    break;
            }
            if (car == 'B' || car == 'C' || car == 'D' || car == 'F' || car == 'G' || car == 'H' || car == 'J' || car == 'K' || car == 'M' || car == 'N' || car == 'Ñ' || car == 'P' || car == 'Q' || car == 'R' || car == 'S' || car == 'T' || car == 'V' || car == 'X' || car == 'Z' || car == 'W' || car == 'Y') {
                consonantes++;
            }
            //Recorremos y contamos todo
            for (String item : textoList) {
                //pasamos como primer parámetro la lista
                // y como segundo la letra que queremos contar
                int cantidad = Collections.frequency(textoList, item);
                // con esto comprobamos que no sea un espacio en blanco
                if (cantidadRepetida < cantidad && !item.equals(" ")) {
                    letraMasRepetida = item;
                    cantidadRepetida = cantidad;
                }
            }
        }
        //mostramos por pantalla cantidad de vocales
        System.out.println("La candidad de vocales es: " + cantidadVocales);
        System.out.println("La cantidad de A es: " + Acontar);
        System.out.println("La cantidad de E es: " + Econtar);
        System.out.println("La cantidad de I es: " + Icontar);
        System.out.println("La cantidad de O es: " + Ocontar);
        System.out.println("La cantidad de U es: " + Ucontar);
        System.out.println(String.format("La letra %s es la que mayor se repite, con %o veces", letraMasRepetida, cantidadRepetida));
        System.out.println("La cantidad de consonantes es :" + consonantes);
    }
}