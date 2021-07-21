package DelPinoIvanRecuperatorioPB2;

import java.util.Comparator;

public class OrdenPorPoder implements Comparator <Luchador> {

	@Override
	public int compare(Luchador o1, Luchador o2) {
		return o2.getPoder().compareTo(o1.getPoder());
	}
	
}
