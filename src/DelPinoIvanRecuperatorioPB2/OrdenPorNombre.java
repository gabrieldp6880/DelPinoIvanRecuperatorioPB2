package DelPinoIvanRecuperatorioPB2;

import java.util.Comparator;

public class OrdenPorNombre implements Comparator <Luchador> {

	@Override
	public int compare(Luchador o1, Luchador o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}
	
}
