import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // inicializar dados do cliente
        String nome = "Jacqueline Oliveira";
        String tipoConta = "Corrente";
        double saldo = 2500;
        int op = 0;

        Scanner leitura = new Scanner(System.in);

        System.out.println("*******************************");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo conta: " +tipoConta);
        System.out.println("Saldo inicial: "+ saldo);
        System.out.println("\n*******************************");
        System.out.println("\n");

        //menu de opções
        String menu = """
                     Operações:
                     1- Consultar saldos.
                     2- Receber valor.
                     3- Transferir valor.
                     4- Sair.
                     Digite a opção desejada:
                      """;

        while (op != 4) {
            System.out.println(menu);
            op = leitura.nextInt();

            if (op == 1){
                System.out.println("O valor atual do saldo é: " + saldo);
            } else if (op == 2) {
                System.out.println("Informe o valor a receber: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atualizado: "+ saldo);
            } else if(op == 3) {
                System.out.println("Informe o valor que deseja transferir: ");
                double valor = leitura.nextDouble();

                if (valor > saldo) {
                    System.out.println("Não há saldo suficiente para fazer essa transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atualizado: " + saldo);
                }
            } else if (op != 4) {
                System.out.println("Opção inválida.");
            }

        }
    }
}