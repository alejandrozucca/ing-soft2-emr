package emr.ing;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {
	
	private Tarjeta t;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		t = new TarjetaComun();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test01() {		
		Assert.assertTrue(t.saldo() == 0);		
	}
	
	@Test
	public void test02() {
		Colectivo c = new Colectivo("Semtur",101);		
		Assert.assertFalse(t.pagarBoleto(c, new Date()));
	}
	
	@Test
	public void test03(){
		t.recarga(195);
		Assert.assertTrue(t.saldo() == 195);
	}
	
	@Test
	public void test04(){
		t.recarga(196);
		Assert.assertTrue(t.saldo() == 230);
	}
	

}
