import java.util.Scanner;
//       SABER SE A LETRA É VOGAL OU CONSOANTE

public class Exerc04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = teclado.next();
    /*
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u")){
            System.out.println("Vogal ");
        }else{
            System.out.println("Consoante");
        }
        */

    if (letra.length() > 1 && letra == "") {
        System.out.println("Não é uma letra válida");
    }else {
        switch (letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U": System.out.println("Vogal "); break;
            default: System.out.println("Consoante");

        }

    }


    }
}
