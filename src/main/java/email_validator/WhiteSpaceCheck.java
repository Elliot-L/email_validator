package email_validator;

public class WhiteSpaceCheck {
	
	public boolean checkWhiteSpace(String s){
		//checks to make sure there is no white space in the email address
		boolean test = false;
		if(!s.contains(" ")){
			test = true;
		}
		return test;
	}
}
