import java.util.Scanner;

//   CALCULAR A MÉDIA DE DUAS NOTAS E MOSTRAR A QUANTIDADE DE APROVEITAMENTO
// E MOSTRAR SE ESTAR APROVADO OU REPROVADO
public class Exer14 {
    public static void main(String[] args ){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = teclado.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = teclado.nextDouble();

        double media = (nota1  + nota2) / 2;

        String aproveitamento = "";

        if (media >= 9 && media <= 10){
            aproveitamento = "A";
        }else if (media >= 7.5 && media < 9){
            aproveitamento = "B";
        }else if (media >= 6 && media <= 7 ){
            aproveitamento = "C";
        }else if (media >= 4 && media < 6 ){
            aproveitamento = "D";
        }else if (media >= 0 && media < 4){
            aproveitamento = "E";
        }
        System.out.println("Nota 1 "+ nota1);
        System.out.println("Nota 2 "+nota2);
        System.out.println("Média "+ media);
        System.out.println("conceito "+aproveitamento);

        switch(aproveitamento){
            case "A":
            case "B":
            case "C": System.out.print("APROVADO"); break;
            case "D":
            case "E": System.out.print("REPROVADO"); break;

        }
    }
}
