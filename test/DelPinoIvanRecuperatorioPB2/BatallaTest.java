package DelPinoIvanRecuperatorioPB2;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class BatallaTest {
	
	@Test (expected = WorldDestroyedException.class)
	public void queSePierdaLaBatalla() throws WorldDestroyedException {
		Heroe h1 = new Heroe ("IronMan", 4);
		Heroe h2 = new Heroe ("Thor", 6);
		Heroe h3 = new Heroe ("CapitanAmerica", 2);
		
		Villano v1 = new Villano ("RedSkull", 7);
		Villano v2 = new Villano ("Loki", 9);
		Villano v3 = new Villano ("Thanos", 8);
		
		Gema g1 = new Gema ("ALMA");
		Gema g2 = new Gema ("TIEMPO");
		Gema g3 = new Gema ("ESPACIO");
		Gema g4 = new Gema ("MENTE");
		Gema g5 = new Gema ("REALIDAD");
		Gema g6 = new Gema ("PODER");
		
		h1.agregarGema(g2);
		h2.agregarGema(g5);
		h3.agregarGema(g1);
		
		v1.agregarGema(g4);
		v2.agregarGema(g6);
		v3.agregarGema(g3);
		
		Batalla b1 =  new Batalla ("New York");
		
		b1.enfrentarPersonajes(h3, v3);
		
		b1.resultadoDeBatalla();
	}
	
	@Test
	public void queSeSalveElMundo () {
		Heroe h3 = new Heroe ("CapitanAmerica", 8);
		Villano v3 = new Villano ("Thanos", 6);
		
		Gema g1 = new Gema ("TIEMPO");
		Gema g6 = new Gema ("REALIDAD");
		
		h3.agregarGema(g1);
		v3.agregarGema(g6);
		
		Batalla b1 =  new Batalla ("New York");
		
		b1.enfrentarPersonajes(h3, v3);
		
		String resultadoEsperado = "El mundo esta salvado";
		
		String resultadoReal = "";
		
		try {
			resultadoReal = b1.resultadoDeBatalla();
		} catch (WorldDestroyedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		assertEquals(resultadoEsperado,resultadoReal);
	}
	
	
	@Test
	public void queDevuelvaVillanosOrdenados () {
		Heroe h1 = new Heroe ("IronMan", 4);
		Heroe h2 = new Heroe ("Thor", 6);
		Heroe h3 = new Heroe ("CapitanAmerica", 2);
		
		Villano v1 = new Villano ("RedSkull", 7);
		Villano v2 = new Villano ("Loki", 9);
		Villano v3 = new Villano ("Thanos", 8);
		
		Gema g1 = new Gema ("ALMA");
		Gema g2 = new Gema ("TIEMPO");
		Gema g3 = new Gema ("ESPACIO");
		Gema g4 = new Gema ("MENTE");
		Gema g5 = new Gema ("REALIDAD");
		Gema g6 = new Gema ("PODER");
		
		h1.agregarGema(g2);
		h2.agregarGema(g5);
		h3.agregarGema(g1);
		
		v1.agregarGema(g4);
		v2.agregarGema(g6);
		v3.agregarGema(g3);
		
		Batalla b1 =  new Batalla ("New York");
		
		b1.enfrentarPersonajes(h3, v3);
		b1.enfrentarPersonajes(h1, v1);
		
		Set <Luchador> villanosOrdenados = b1.devolverVillanosGanadoresOrdenados();
	
		Integer i = 0;

		Iterator<Luchador> it = villanosOrdenados.iterator();

		while (it.hasNext()) {
			Luchador l = it.next();
			switch (i) {
			case 0:
				Integer esperado1 = 21;
				Integer real1 = l.getPoder();
				assertEquals(esperado1, real1);
				i++;
				break;
			case 1:
				Integer esperado2 = 16;
				Integer real2 = l.getPoder();
				assertEquals(esperado2, real2);
				i++;
				break;
			}
		}
	}
	
	@Test
	public void queDevuelvaHeroesOrdenados () {
		Heroe h1 = new Heroe ("IronMan", 10);
		Heroe h2 = new Heroe ("Thor", 6);
		Heroe h3 = new Heroe ("CapitanAmerica", 8);
		
		Villano v1 = new Villano ("RedSkull", 7);
		Villano v2 = new Villano ("Loki", 9);
		Villano v3 = new Villano ("Thanos", 8);
		
		Gema g1 = new Gema ("ALMA");
		Gema g2 = new Gema ("TIEMPO");
		Gema g3 = new Gema ("ESPACIO");
		Gema g4 = new Gema ("MENTE");
		Gema g5 = new Gema ("REALIDAD");
		Gema g6 = new Gema ("PODER");
		
		h1.agregarGema(g2);
		h2.agregarGema(g5);
		h3.agregarGema(g1);
		
		v1.agregarGema(g4);
		v2.agregarGema(g6);
		v3.agregarGema(g3);
		
		Batalla b1 =  new Batalla ("New York");
		
		b1.enfrentarPersonajes(h3, v3);
		b1.enfrentarPersonajes(h1, v1);
		
		Set <Luchador> heroesOrdenados = b1.devolverHeroesGanadoresOrdenados();
	
		Integer i = 0;

		Iterator<Luchador> it = heroesOrdenados.iterator();

		while (it.hasNext()) {
			Luchador l = it.next();
			switch (i) {
			case 0:
				String esperado1 = "CapitanAmerica";
				String real1 = l.getNombre();
				assertEquals(esperado1, real1);
				i++;
				break;
			case 1:
				String esperado2 = "IronMan";
				String real2 = l.getNombre();
				assertEquals(esperado2, real2);
				i++;
				break;
			}
		}
	}
	
}
