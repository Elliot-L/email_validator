package email_validator;

public class MultipleAtCheck {
	//the method returns true only if there is exactly one '@', and fails if there are multiple '@' 
	public boolean checkAt(String s){
		boolean test = false;
		
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '@'){
				count++;
			} 
		}
		
		if(count == 1){
			test = true;
		}
		return test;
	}
}
