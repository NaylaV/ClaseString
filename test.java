import java.util.Scanner;
class test {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        String frase;
        int vocals = 0;

        System.out.println("*** Comptador de vocales ***");
        System.out.println("Escribe una frase: ");
        frase = entrada.nextLine();

        for(int x = 0; x < frase.length(); x++){
            if ((frase.toUpperCase().charAt(x) == 'A') || (frase.toUpperCase().charAt(x) == 'E') ||
                    (frase.toUpperCase().charAt(x) == 'I') || (frase.toUpperCase().charAt(x) == 'O') || (frase.toUpperCase().charAt(x) == 'U')){
                vocals++;
            }

        }
        System.out.println("\nNumero de vocales: " + vocals);
    }
}