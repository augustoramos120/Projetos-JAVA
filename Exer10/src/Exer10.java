import java.util.Scanner;
public class Exer10 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o turno que você estuda: ");
        String turno = teclado.next();
       // char opcao;
        //opcao = 'S';
       // do {
            switch (turno) {
                case "m":
                case "M":
                    System.out.println("BOM DIA! ");
                    break;
                case "v":
                case "V":
                    System.out.println("BOA TARDE! ");
                    break;
                case "n":
                case "N":
                    System.out.println("BOA NOITE! ");
                    break;
                default:
                    System.out.println("Valor Inválido !!");
                    System.out.println("Continua S ou N? ");
            }
        //}while (opcao != 'N');

    }
}
