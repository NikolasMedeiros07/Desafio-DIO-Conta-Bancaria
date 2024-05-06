import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o número da conta que você quer criar: ");
    int numero_conta = scanner.nextInt();

    System.out.println("Por favor, digite o número da sua nova agência(XXX-Y): ");
    String numero_agencia = scanner.next();

    System.out.println("Por favor, digite o seu nome: ");
    String nome_cliente = scanner.next();

    System.out.println("Por favor, digite o valor que você depositará na conta(Use ponto, não virgula): ");
    double valor_deposito = scanner.nextDouble();

    System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é: "+ numero_agencia +", conta: "+ numero_conta + " e seu saldo é: R$"+ valor_deposito +", que já está disponível para saque!!");

    scanner.close();
    }
}
