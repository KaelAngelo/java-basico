import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
           Scanner scanner = new Scanner(System.in);
           
           System.out.println("Por favor, digite o número da Agência: ");
           String agencia = scanner.next();

           System.out.println("Digite o número de sua conta: ");

           int conta = scanner.nextInt();

           System.out.println("Digite seu nome: ");
           String nome = scanner.next();

           System.out.println("Informe o saldo: ");
           double saldo = scanner.nextDouble();

           System.out.println("Olá "+nome+", "+ 
           "obrigado por criar um conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo "+saldo+" já está disponível.");
 


    }

    
}
