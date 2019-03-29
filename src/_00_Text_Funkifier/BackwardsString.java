package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String s2 = "";
		for (int i = s.length()-1; i > -1 ; i--) {
		s2 = s2+ s.charAt(i);
	}
		s =s2;
		return s;
	}

}
