package email_validator;

public class ValidatorTest {
	import org.junit.Test;
	import static org.junit.Assert.assertEquals;

	public class ValidatorTest {
		
	   String message = "Hello World";	
	   Validator v = new Validator();

	   @Test
	   public void testValidate() {	  
		   String fail = "thisshouldfail";
		   String pass = "this.should@pass";
		   
		   boolean f = false;
		   boolean t =  true;
		   
		   assertEquals(t, v.validate(pass));
		   assertEquals(t, v.validate(fail));
	   }
	}
}
