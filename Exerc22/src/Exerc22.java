import java.util.Scanner;
public class Exerc22 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de g de morango");
        double qtdMorango = teclado.nextDouble();

        System.out.println("Digite a quantidade de Kg de maça");
        double qtdMaca = teclado.nextDouble();

        double precoKgMorango = 0;
        if(qtdMorango <= 5 ){
            precoKgMorango = 2.5;
        }else {
            precoKgMorango = 2.2;
        }
        double precoKgMaca = 0;
        if (qtdMaca <= 5){
            precoKgMaca = 1.8;
        }else {
            precoKgMaca = 1.5;
        }
        double precoTotalMorango = qtdMorango * precoKgMorango;
        double prcoTotalMaca = qtdMaca * precoKgMaca;
        double precoParcial = precoKgMorango + precoKgMaca;
        double precoTotal = precoParcial;

        if((qtdMorango + qtdMaca > 8) || precoParcial > 25){
        precoTotal = precoParcial - ((precoParcial / 100) * 10);

        }
        System.out.println("Preco total = " +precoTotal);
    }
}
