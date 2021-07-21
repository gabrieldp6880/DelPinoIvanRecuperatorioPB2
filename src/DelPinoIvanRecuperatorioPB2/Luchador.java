package DelPinoIvanRecuperatorioPB2;

import java.util.HashSet;
import java.util.Set;

public abstract class Luchador implements Comparable <Luchador> {
	
	private String nombre;
	private Integer poder;
	private Set <Gema> gemas;
	
	public Luchador(String nombre, Integer poder) {
		this.nombre = nombre;
		this.poder = poder;
		this.gemas = new HashSet<>();
	}
	
	public abstract String getBando();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPoder() {
		return poder;
	}

	public void setPoder(Integer poder) {
		this.poder = poder;
	}
	
	public void agregarGema (Gema g1) {
		if(g1.getNombre()=="TIEMPO"||g1.getNombre()=="MENTE"||g1.getNombre()=="PODER") {
			this.poder=this.poder*3;
		}else {
			this.poder=this.poder*2;
		}
	}
	
}
