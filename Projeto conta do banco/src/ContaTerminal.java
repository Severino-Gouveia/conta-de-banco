import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       try (Scanner scan = new Scanner(System.in)) {
        System.out.println("Por favor, digite o número da Conta !");
           int Numero = scan.nextInt();
           System.out.println("Por favor, digite o número da Agência !");
           String Agencia = scan.next();
           System.out.println("Por favor, digite seu Nome !");
           String NomeCliente = scan.next();
           double Saldo =  237.48;
           System.out.println("Olá "+NomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é : "+Numero+ ", conta : " +Agencia+ " e seu saldo : " +Saldo+ " já está disponível para saque.");
    }
    }
}
