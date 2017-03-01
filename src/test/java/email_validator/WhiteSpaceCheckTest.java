package email_validator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;




public class WhiteSpaceCheckTest {
	WhiteSpaceCheck check = new WhiteSpaceCheck();
	String fail = "fa il";
	String pass = "pass";
	boolean p = true;
	boolean f = false;
	
	@Test
	public void testWhiteSpace(){
		assertEquals(p, check.spaceCheck(pass));
		assertEquals(f, check.spaceCheck(fail));

	}
}