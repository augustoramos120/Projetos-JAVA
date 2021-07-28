import java.util.Scanner;
//CALCULAR A PORCENTAGEM DE CADA SALARIO
public class Exer11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        char opcao = 'S';
        do {
        System.out.println("Digite o salário: ");

        double salario = teclado.nextDouble();

            int percentual = 0;
            if (salario <= 280) {
                percentual = 20;
            } else if (salario > 280 && salario < 700) {
                percentual = 15;
            } else if (salario >= 700 && salario < 1500) {
                percentual = 10;
            } else if (salario >= 1500) {
                percentual = 5;
            }
            double aumento = (salario / 100) * percentual;
            double salarioAjustado = salario + aumento;

            System.out.println("Salario:  " + salario);
            System.out.println("Percentual: " + percentual + " %");
            System.out.println("Aumento: " + aumento);
            System.out.println("Salário ajustado: " + salarioAjustado);
            System.out.println("Continuar S ou N");
            opcao = teclado.next().toUpperCase().charAt(0);
        }while (opcao != 'N');
    }
}
