
import static junit.framework.Assert.assertTrue;
import org.junit.Test;
import org.junit.experimental.categories.Category;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aelittaezugbaa
 */
public class TestForTesting {
    
    @Test
    
    public void trueHello() throws Exception{
        ForTesting test=new ForTesting();
        assertTrue(test.value());
    }
    @Test
	@Category(com.mycompany.category.UnitTests.class)
	public void appUnitTest() {
		System.out.println("Unit test");
	}

	@Test
	@Category(com.mycompany.category.IntegrationTests.class)
	public void appIntegrationTest() {
		System.out.println("Integration test");
	}

    
}
