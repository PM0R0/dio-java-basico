package desafio1;
import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();
        
        String valorFinal = String.format("%.1f",calcularSaldo(saldoAtual,valorDeposito,valorRetirada));
        
        System.out.println("Saldo atualizado na conta: "+valorFinal);
        scanner.close();
    }
    
    public static double calcularSaldo(double saldoAtual, double valorDeposito, double valorRetirada){
     return ((saldoAtual+valorDeposito)-valorRetirada);
    }
}  