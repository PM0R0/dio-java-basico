
public class Usuario {
	public static void main(String[] srgs) throws Exception {
		SmartTv smartTv = new SmartTv();
		
		System.out.println("TV Ligada ? " +( smartTv.ligada ? "Sim" : "Não"));
		System.out.println("Canal atual ? " + smartTv.canal);
		System.out.println("Volume atual ? " + smartTv.volume);
		
		smartTv.ligar();
		System.out.println("TV Ligada ? " +( smartTv.ligada ? "Sim" : "Não"));
		
		smartTv.aumentarVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarCanal();
		smartTv.diminuirCanal();
		smartTv.trocarCanal(10);
	}
}
