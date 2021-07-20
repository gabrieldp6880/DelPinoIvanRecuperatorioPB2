package DelPinoIvanRecuperatorioPB2;

import java.util.Comparator;

public class OrdenPorNombre implements Comparator <Luchador> {

	@Override
	public int compare(Luchador o1, Luchador o2) {
		return o2.getNombre().compareTo(o1.getNombre());
	}
	
}
