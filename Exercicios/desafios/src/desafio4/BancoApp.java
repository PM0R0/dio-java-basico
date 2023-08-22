package desafio4;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
     
        double valorInicial = scanner.nextDouble();//5000
        
     
        double taxaJuros = scanner.nextDouble();//0.08
        
        int periodo = scanner.nextInt(); //5
        
        double valorFinal = calcularJurosComposto(valorInicial, taxaJuros, periodo);

        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        //valorInicial(1+taxaJuros)^periodo

        System.out.printf("Valor final do investimento: R$ %.2f %n",  valorFinal);
        //println("Valor final do investimento: R$ " + valorFinal);
        
        scanner.close();
    }
    
    public static double calcularJurosComposto(double capital, double taxa, int anos) {
    	double jurosCalculado = capital*(Math.pow((1+taxa), anos));
    	return jurosCalculado;
    }
}