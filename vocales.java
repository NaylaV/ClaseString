import javax.swing.JOptionPane;

public class vocales {

    public static void main(String[] args) {

        String texto = JOptionPane.showInputDialog(null,
                "Inserta una frase",
                "Inserción",
                JOptionPane.INFORMATION_MESSAGE);

        texto = texto.toLowerCase();  //lo pasamos a minusculas para igualar todas las letras

        int contador_vocales = 0;

        char vocales[] = {'a', 'e', 'i', 'o', 'u'}; //Arrays con vocales

        char caracterActual;
        boolean esVocal = false;

        for(int i=0;i<texto.length();i++){ //recorro la cadena

            caracterActual=texto.charAt(i);

            for(int j=0;j<vocales.length && !esVocal;j++){  //Recorro las vocales comparando con el caracter
                //Cuando lo encuentra, aumenta el contador y sale del bucle
                if(caracterActual==vocales[j]){
                    esVocal=true;
                    contador_vocales++;
                }
            }
            esVocal=false;
        }
        JOptionPane.showMessageDialog(null,
                "La frase tiene "+contador_vocales+" vocales",
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);

    }
}