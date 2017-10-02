package projeto1;
import java.util.*;

public class Projeto1 {
    
//Basicamente vamos ver se a nossa classe reconhece algum dos três padrões, dado alguma sequência passada pelo usuário

    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       String entrada = "";
       Padroes teste = new Padroes();
       while(true){
            entrada = leitor.nextLine();
            if(entrada.equalsIgnoreCase("fim")) break;
            
            else if(teste.cpfValido(entrada)){
                System.out.println(entrada + " é um cpf");
            }

            else if(teste.carroValido(entrada)){
                System.out.println(entrada + " é numero de carro");
            }

            else if(teste.telefoneValido(entrada)){
                System.out.println(entrada + " é um telefone válido");
            }

            else System.out.println("Não é valido para nenhum padrão");
        }
    }
}
