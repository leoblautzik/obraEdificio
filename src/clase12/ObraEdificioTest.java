package clase12;

import static org.junit.Assert.*;

import org.junit.Test;

public class ObraEdificioTest {

	@Test
	public void test() {
		ObraEdificio miCasita = new ObraEdificio(200);
		assertFalse(miCasita.terminado());
	}

}
