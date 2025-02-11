import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String agencia, nomeCliente;
        double saldo;

        nomeCliente = lerString(scanner, "Digite o seu nome: ");

        numeroConta = lerInteiro(scanner);

        agencia = lerString(scanner, "Digite o número da agencia: ");

        saldo = lerDouble(scanner);

        Conta conta = new Conta(numeroConta, agencia, nomeCliente, saldo);

        System.out.println(conta);
    }

    private static int lerInteiro(Scanner scanner) {
        int valorRetorno;
        do {
            System.out.print("Digite o número da conta: ");
            try {
                valorRetorno = scanner.nextInt();
                scanner.nextLine();
                return valorRetorno;
            }
            catch (Exception ex) {
                System.out.println("Dado informado inválido, tente novamente.");
                scanner.nextLine();
            }
        } while (true);
    }

    private static String lerString(Scanner scanner, String mensagem) {
        String valorRetorno;
        do {
            System.out.print(mensagem);
            try {
                valorRetorno = scanner.nextLine();
                if (valorRetorno.trim().isEmpty()){
                    System.out.println("Não pode ser vazio!");
                    continue;
                }
                return valorRetorno;
            }
            catch (Exception ex) {
                System.out.println("Dado informado inválido, tente novamente.");
                scanner.nextLine();
            }
        } while (true);
    }

    private static double lerDouble(Scanner scanner) {
        double valorRetorno;
        do {
            System.out.print("Digite o seu saldo: ");
            try {
                valorRetorno = scanner.nextDouble();
                scanner.nextLine();
                return valorRetorno;
            }
            catch (Exception ex) {
                System.out.println("Dado informado inválido, tente novamente.");
                scanner.nextLine();
            }
        } while (true);
    }
}

