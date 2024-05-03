import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    ContaBanco conta = new ContaBanco();
    Scanner scanner = new Scanner(System.in);

    imprimirSaudacaoInicial();

    conta.criarConta(scanner);

    imprimirSaudacaoFinal();

    scanner.close();
  }

  static void imprimirSaudacaoInicial() {
    System.out.println("Bem vindo(a)!!!\nVamos preencher seus dados bancários!");
  }

  static void imprimirSaudacaoFinal() {
    System.out.println("Obrigado por utilizar nossos serviços, tenha um ótimo dia!");
  }
}
