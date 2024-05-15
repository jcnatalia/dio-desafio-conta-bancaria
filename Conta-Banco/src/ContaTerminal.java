import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, informe o seu nome completo: ");
        String nome = scanner.next();

        System.out.println("Digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da Conta: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o valor depositado na conta: ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá, "  +  nome  +  " obrigada por criar uma conta em nosso banco, sua agência é "  + 
        agencia  +  " conta "  +  conta  +  " e seu saldo de R$ "  +  saldo  +  " já está disponível para saque!"); 
        
        
    }
}
