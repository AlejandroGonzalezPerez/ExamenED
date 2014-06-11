package codigo;

import static org.junit.Assert.*;
import org.junit.Test;

public class ExamenED {

	
	@Test
	public void test() {
		
		Resta resta = new Resta(6, 3);  
        int resultado1 = resta.resta();  
        assertTrue(resultado1 == 3);  
		System.out.println(resta);
	}

}
