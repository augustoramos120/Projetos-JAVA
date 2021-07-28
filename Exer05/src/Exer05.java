import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char opcao = 'S';
        do {
            System.out.println("Digite a primeira nota: ");
            double nota1 = teclado.nextDouble();

            System.out.println("Digite a segunda nota: ");
            double nota2 = teclado.nextDouble();

            double media = (nota1 + nota2) / 2;

            System.out.println("A sua nota é: " + media);
            if (media == 10) {
                System.out.println("Aprovado com distinção");
            } else if (media >= 7) {
                System.out.println("APROVADO");
            } else {
                System.out.println("REPROVADO");
            }
            System.out.println("Continuar S ou N: ");
            opcao = teclado.next().toUpperCase().charAt(0);
        }while (opcao != 'N');
    }
    }
