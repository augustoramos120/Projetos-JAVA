import java.util.Scanner;
// VALIDAR AS SEGUINTES INFORMAÇOES
//NOME MAUIOR QUE 3 CARACTER
//IDADE ENTRE 0 E 150
//SALARIO MAIOR QUE 0
//SEXO 'F' OU 'M'
//ESTADO CIVIL 'S', 'C', 'V', 'D'

public class Exerc03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean infoValida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        do {
        System.out.println("Digite o nome");
        nome = teclado.next();

        if(nome.length() >= 3){
            infoValida = true;
        }else{
            System.out.println("Nome precisa ter mais que duas letras");
            }
        }while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite a idade");
            idade = teclado.nextInt();

            if(idade >= 0 && idade <= 150){
                infoValida = true;
            }else{
                System.out.println("Nome precisa ter mais que duas letras");
            }
        }while (!infoValida);
        infoValida = false;

        do {
            System.out.println("Digite o sálario");
            salario = teclado.nextDouble();

            if(salario > 0){
                infoValida = true;
            }else{
                System.out.println("O salário deve ser maior que zero");
            }
        }while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite o sexo");
            sexo = teclado.next();

            if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
                infoValida = true;
            }else{
                System.out.println("Sexo precisa ser F ou M");
            }
        }while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite o estado civil");
            estadoCivil = teclado.next();

            if(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")){
                infoValida = true;
            }else{
                System.out.println("Nome precisa ter mais que duas letras");
            }
        }while (!infoValida);

        System.out.println("As suas informações são: ");
        System.out.println("Nome: " +nome);
        System.out.println("Idade: " +idade);
        System.out.println("Salário: " +salario);
        System.out.println("Sexo: " +sexo);
        System.out.println("Estado Civil: " +estadoCivil);

    }
}