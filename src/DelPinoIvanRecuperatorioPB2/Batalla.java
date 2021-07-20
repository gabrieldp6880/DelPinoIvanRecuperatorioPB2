package DelPinoIvanRecuperatorioPB2;

import java.util.Comparator;
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
		OrdenPorPoder orden = new OrdenPorPoder();
		TreeSet <Luchador> villanosGanadoresOrdenados = ordenarLuchadores (orden, villanosGanadores);
		return villanosGanadoresOrdenados;
	}
	
	public TreeSet <Luchador> devolverHeroesGanadoresOrdenados () {
		OrdenPorNombre orden = new OrdenPorNombre();
		TreeSet <Luchador> heroesGanadoresOrdenados = ordenarLuchadores (orden, heroesGanadores);
		return heroesGanadoresOrdenados;
	}
	
	private TreeSet <Luchador> ordenarLuchadores (Comparator criterio, TreeSet <Luchador> luchadores){
		
		TreeSet <Luchador> luchadoresOrdenados = new TreeSet<> (criterio);
		luchadoresOrdenados.addAll(luchadores);
		return luchadoresOrdenados;
	}
	
	private String resultadoDeBatalla () throws WorldDestroyedException {
		if(heroesGanadores.size()>villanosGanadores.size()) {
			return "El mundo esta salvado";
		}else {
			throw new WorldDestroyedException();
		}
	}
	
	
}
