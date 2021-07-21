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

	public void enfrentarPersonajes (Heroe h3, Villano v3) {
		if(h3.getPoder()>=v3.getPoder()) {
			heroesGanadores.add(h3);
		}else {
			villanosGanadores.add(v3);
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
	
	public TreeSet <Luchador> ordenarLuchadores (Comparator criterio, TreeSet <Luchador> luchadores){
		
		TreeSet <Luchador> luchadoresOrdenados = new TreeSet<> (criterio);
		luchadoresOrdenados.addAll(luchadores);
		return luchadoresOrdenados;
	}
	
	public String resultadoDeBatalla () throws WorldDestroyedException {
		if(heroesGanadores.size()>villanosGanadores.size()) {
			return "El mundo esta salvado";
		}else {
			throw new WorldDestroyedException();
		}
	}

	public String getNombreBatalla() {
		return nombreBatalla;
	}

	public void setNombreBatalla(String nombreBatalla) {
		this.nombreBatalla = nombreBatalla;
	}

	public TreeSet<Luchador> getHeroesGanadores() {
		return heroesGanadores;
	}

	public void setHeroesGanadores(TreeSet<Luchador> heroesGanadores) {
		this.heroesGanadores = heroesGanadores;
	}

	public TreeSet<Luchador> getVillanosGanadores() {
		return villanosGanadores;
	}

	public void setVillanosGanadores(TreeSet<Luchador> villanosGanadores) {
		this.villanosGanadores = villanosGanadores;
	}
	
	
}
