package pkgParameterPassing;

public class MyCharacterUtility extends CharacterUtility {  // final class cannot be overriden
	public final void countVowels(String str) {  // wont work since final method cannot be overriden
	}
}
