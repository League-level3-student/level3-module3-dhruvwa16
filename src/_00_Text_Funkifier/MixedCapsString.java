package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String s2 = "";
		for (int i = 0; i < s.length(); i++) {
			if(i%2 == 0) {
			s2 = s2 + s.toLowerCase().charAt(i);
			}
			if(i%2 == 1){
				 s2 = s2 + s.toUpperCase().charAt(i);
			}
}
		s =s2;
		return s;
	}
}