public class SmartTv {
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	public void ligar() {
		ligada=true;
		
		System.out.println("Ligando a TV...");
	}
	
	public void desligar() {
		ligada=false;
		
		System.out.println("Desligando a TV...");
	}
	
	public void aumentarVolume() {
		volume++;
		System.out.println("Aumentando volume para "+volume);
	}
	
	public void diminuirVolume() {
		volume--;
		System.out.println("Aumentando volume para "+volume);
	}
	
	public void aumentarCanal() {
		canal++;
		System.out.println("Trocado para o canal:"+canal);
	}
	
	public void diminuirCanal() {
		canal--;
		System.out.println("Trocado para o canal:"+canal);
	}
	
	public void trocarCanal(int novoCanal) {
		canal = novoCanal;
		System.out.println("Trocado para o canal:"+canal);
	}
}
