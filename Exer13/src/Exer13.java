import java.util.Scanner;
//---------------  LER UM NUMERO A  MOSTRAR DIA DA SEMANA CORRESPONDENTE
public class Exer13 {
    public static void main(String[]args ){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um dia da semana: ");

        int diaSemana = teclado.nextInt();

        switch (diaSemana){
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terça"); break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta"); break;
            case 7: System.out.println("Sábado"); break;
            default: System.out.println("Não é um dia válido");

        }
    }
}
