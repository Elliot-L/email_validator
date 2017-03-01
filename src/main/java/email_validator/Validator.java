package email_validator;


public class Validator {

	
	public boolean validate(String s){
		boolean test = false;
		
		if(s.contains(Character.toString('.')) && s.contains(Character.toString('@'))){
			test = true;
		}
		
		return test;
		
	}
}