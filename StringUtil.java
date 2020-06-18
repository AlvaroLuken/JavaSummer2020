
public class StringUtil {
	
	public static void main(String[] args) {
		StringBuilder input1 = new StringBuilder("How are you my friend, How is everyone, How is John?");
		
		
		String find = "How";
		String strReplaceWith = "Where";
		
		replaceStringBuilder(input1, find, strReplaceWith, 0, 26);
	
		
		StringBuilder input2 = new StringBuilder("Would you help me with my homework Larissa, would you Larissa? Why not Larissa?");
		
		String find2 = "Larissa";
		String strReplaceWith2 = "John";
		
		replaceStringBuilder(input2, find2, strReplaceWith2);
		
		
		
		StringBuilder input3 = new StringBuilder("How to do this? How to do that Theo?");
		String find3 = "o";
		String strReplaceWith3 = "oo";
		
		replaceStringBuilder(input3, find3, strReplaceWith3);

		StringBuilder input4 = new StringBuilder("FUCK the protestors! Protestors are garbage, they suck fucking protestors are shit!");
		String find4 = "protestors";
		String strReplaceWith4 = "police";
		
	//	replaceStringBuilder(input4, find4, strReplaceWith4);
	//	replaceStringBuilder(input4, "Protestors", "Police");
		
		
		
		StringBuilder input5= new StringBuilder("Simon, Simon, Simon, you can't always get what you want Simon");

        String find5 = "Simon";

        String strReplaceWith5 = "Ray";

        replaceStringBuilder(input5, find5, strReplaceWith5,0,26);
		
	}
	
	public static void replaceStringBuilder(StringBuilder input, String find, String strReplaceWith,
			int startPosition, int endPosition) {
		
		

		
		int length = find.length();
		int lengthOfReplacement = strReplaceWith.length();
		char c = find.charAt(0);
		
		if(endPosition != input.length()) {
			
		}
		
		int len = endPosition;
		
		for(int i = startPosition; i <= (endPosition=len); i++) {

			StringBuilder s = input;
			CharSequence fragment;
			if(length+i <= endPosition && length+i <= input.length()) {
				fragment = s.subSequence(i, length+i);
			} else {
				break;
			}
			
			
			
//			if(fragment.equals(find) && (Character.isUpperCase(fragment.charAt(0)) && Character.isLowerCase(c))) {
//				
//				System.out.println("HEEEY");
//			}

			if(fragment.equals(find) && (fragment.charAt(0) == c)) {
				
				
				
				input.replace(i, length+i, strReplaceWith);
				
				if(i+lengthOfReplacement-length < 0) {
					i = 0; 
				} else {
					i = i+lengthOfReplacement-length;
				}
				len = len+lengthOfReplacement-length;
				
			}
			
		}
		
		System.out.println(input.toString());

	}
	
	public static void replaceStringBuilder(StringBuilder input, String find, String strReplaceWith) {
		replaceStringBuilder(input, find, strReplaceWith, 0, input.length());
	}

}
