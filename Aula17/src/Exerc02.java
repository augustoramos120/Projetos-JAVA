import java.util.Scanner;
// LER O NOME DE UM USUÁRIO E SUA SENHA E NÃO ACEITE
// A SENHA IGUAL AO NOME, MOSTRANO UMA MSN DE ERRO
// E VOLTANDO A PEDIR AS INFORMAÇÕES
public class Exerc02 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        boolean infoValidas = false;
        String nomeUser;
        String senha;

        do{
            System.out.println("Entre com o usuário: ");
            nomeUser = teclado.next();

            System.out.println("Entre com a senha: ");
            senha = teclado.next();

            if (nomeUser.equalsIgnoreCase(senha)){
                infoValidas = false;
                System.out.println("Senha igual ao usuário, digite novamente");
            }else{
                infoValidas = true;
                System.out.println("Senha e usuário válidos");
            }
        }while (!infoValidas);
    }
}
