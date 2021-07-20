package DelPinoIvanRecuperatorioPB2;

import java.util.TreeSet;

public class Batalla {
	
	private String nombreBatalla;
	private TreeSet <Luchador> heroesGanadores;
	private TreeSet <Luchador> villanosGanadores;
	

	public Batalla(String nombreBatalla) {
		this.nombreBatalla = nombreBatalla;
		this.heroesGanadores = new TreeSet <>();
		this.villanosGanadores = new TreeSet <>();
	}

	public void enfrentarPersonajes (Heroe l1, Villano l2) {
		if(l1.getPoder()>=l2.getPoder()) {
			heroesGanadores.add(l1);
		}else {
			villanosGanadores.add(l2);
		}
	}
	
	public TreeSet <Luchador> devolverVillanosGanadoresOrdenados () {
		
	}
	
	public TreeSet <Luchador> devolverHeroesGanadoresOrdenados () {
		
	}
	
	private TreeSet <Luchador>
	
	
}
