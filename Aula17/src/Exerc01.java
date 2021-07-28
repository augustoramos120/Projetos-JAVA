import java.util.Scanner;
// DIGITE UMA NOTA VÀLIDA ENTRE 0 & 10

public class Exerc01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean notaValida = false;

        do {
            System.out.println("Entre com uma nota entre 0 e 10 ...");

            double nota = teclado.nextDouble();

            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Você digitou: " + nota);
            } else {
                System.out.println("Nota inválida, digite novamente!");
            }
        }while (!notaValida);
    }
}
