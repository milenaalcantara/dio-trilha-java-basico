import java.util.Scanner;

public class ContaBanco {
  String nomeCliente = "";
  String agencia = "";
  int numeroConta = 0;
  double saldo = 0.0;

  public void exibirMensagemBoasVindas() {
    System.out.println("Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia + ", conta " + this.numeroConta + " e seu saldo " + this.saldo + " já está disponível para saque");
  }

  public void consultarSaldo() {
    System.out.println("Saldo: " + this.saldo);
  }
  
  public void depositar(double valor) {
    this.saldo += valor;
  }

  public void sacar(double valor) {
    if (this.saldo >= valor) {
      this.saldo -= valor;
    } else {
      System.out.println("Saldo insuficiente!");
    }
  }

  public void imprimirMenu() {
    System.out.println("Escolha uma opção:");
    System.out.println("1 - Consultar saldo");
    System.out.println("2 - Depositar");
    System.out.println("3 - Sacar");
    System.out.println("4 - Sair");
  }

  public void criarConta(Scanner scanner) {
    System.out.print("Digite o seu nome: ");
    this.nomeCliente = scanner.nextLine();
    System.out.print("Digite a número da agência com dígito: ");
    this.agencia = scanner.nextLine();
    System.out.print("Digite o número da conta (somente números): ");
    this.numeroConta = scanner.nextInt();
    System.out.print("Digite seu saldo inicial (utilize vírgula para decimais): ");
    this.saldo = scanner.nextDouble();
  }
}
