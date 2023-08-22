package desafio3;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // Entrada de dados
    Scanner scanner = new Scanner(System.in);
    int saldoTotal = scanner.nextInt();
    int valorSaque = scanner.nextInt();

    saque(saldoTotal, valorSaque);
    scanner.close();
  }
  
  public static void saque(int saldoDisponivel, int valorSaque){
	  String resposta = "";
	  
	  if(valorSaque > saldoDisponivel)
	  	resposta = "Saldo insuficiente. Saque nao realizado!";
	  else
		  resposta = "Saque realizado com sucesso. Novo saldo: "+(saldoDisponivel-valorSaque);
    System.out.println(resposta);
  }
}
