package email_validator;

import org.junit.Test;
	import static org.junit.Assert.assertEquals;

	public class ValidatorTest {
		
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

