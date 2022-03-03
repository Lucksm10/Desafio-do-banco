package dio.com.br;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        for(int i = 0; i <= 2; i++) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Escreva o nome do cliente:");
            String nome = scan.next();

            Cliente cliente = new Cliente();
            cliente.setNome(nome);

            Conta corrente = new ContaCorrente(cliente);
            Conta poupanca = new ContaPoupanca(cliente);

            corrente.depositar(100);
            corrente.transferir(100, poupanca);

            corrente.imprimirExtrato();

        }


    }
}
