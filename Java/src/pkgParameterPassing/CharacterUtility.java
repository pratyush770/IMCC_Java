package pkgParameterPassing;

public final class CharacterUtility {
	public final void countVowels(String str) {
		int count = 0;
		for (int i=0;i<str.length();i++) {
			if ("aeiouAEIOU".indexOf(str.charAt(i)) != -1) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public final void countOccurence(char ch, String str) {
		int count = 0;
		for (int i=0;i<str.length();i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(count);
	}
	
}