import java.util.Scanner;
public class Exerc21 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de litros vendidos: ");
        double litros = teclado.nextDouble();

        System.out.println("Digite o tipo de combustível: ");
        String tipo = teclado.next();

        double precoGas = 2.5;
        double precoAlc = 1.9;
        double totalDesc = 0;
        int percDesconto = 0;
        double total = 0;

        if(tipo.equalsIgnoreCase("a")){
            if(litros <= 20){
                percDesconto = 3;
            }else {
                percDesconto = 5;
            }total = litros * precoAlc;
        }else if(tipo.equalsIgnoreCase("g")){
            if (litros <= 20){
                percDesconto = 4;
            }else{
                percDesconto = 6;
            }total = litros * precoGas;
        }
        totalDesc = (total/100) * percDesconto;
        double precoAPagar = total - totalDesc;
        System.out.println(" O valor é: "+precoAPagar);


    }
}

