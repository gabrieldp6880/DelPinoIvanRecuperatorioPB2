package DelPinoIvanRecuperatorioPB2;

public class Villano extends Luchador {

	public Villano(String n, Integer p) {
		super(n, p);
	}

	@Override
	public String getBando() {
		return this.getClass().getSimpleName();
	}

	@Override
	public int compareTo(Luchador o) {
		return this.getPoder().compareTo(o.getPoder());
	}

}
