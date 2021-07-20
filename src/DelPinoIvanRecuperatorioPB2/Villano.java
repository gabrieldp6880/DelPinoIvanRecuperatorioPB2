package DelPinoIvanRecuperatorioPB2;

public class Villano extends Luchador {

	public Villano(String n, Integer p) {
		super(n, p);
	}

	@Override
	public String getBando() {
		return this.getClass().getSimpleName();
	}

}
