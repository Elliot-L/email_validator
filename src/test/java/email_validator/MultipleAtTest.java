package email_validator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultipleAtTest {
	
	MultipleAtCheck check = new MultipleAtCheck();
	
	@Test
	public boolean checkMultipleAt(){
		
		String pass = "pass@pass";
		String fail = "fail@fail@";
		
		boolean p = true;
		boolean f = false;
		
		assertEquals(p, check.checkAt(pass));
		assertEquals(f, check.checkAt(fail));
	}
}
