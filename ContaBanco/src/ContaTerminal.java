import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Conta conta = new Conta();

        System.out.println("Informe o numero da agencia");
        conta.numero = Integer.parseInt(scanner.next());

        System.out.println("Informe a agencia");
        conta.agencia = scanner.next();

        System.out.println("Informe seu nome");
        conta.nomeCliente = scanner.next();

        System.out.println("Informe o saldo");
        conta.saldo = Double.valueOf(scanner.next());

        System.out.println(
                "Olá "  + conta.nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "
                        + conta.agencia + ", conta "+conta.numero+" e seu saldo "
                        + conta.saldo + " já está disponível para saque");

    }
}
