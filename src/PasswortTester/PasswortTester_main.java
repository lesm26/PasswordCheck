package PasswortTester;
import java.util.Scanner;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;
public class PasswortTester_main {

	public static void main(String[] args) {
		//Variablen: 
		

		boolean conditionLength = false, conditionUp = false, conditionLower = false, conditionNum = false, conditionSpc = false, conditionWS = false;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Erstellen Sie ein Passwort: ");
		String name = input.nextLine();
		
		
		
		//System.out.println("Das von Ihnen gewählte Passwort lautet: " + name);
		
		
		
		for(int i = 0; i < name.length() - 1; i++) {
			if(name.length() <= 7) {
			conditionLength = false;
			} else {
			conditionLength = true;
			}
			if(Character.isUpperCase(name.charAt(i)) == true) {
			conditionUp = true;
			}
			if(Character.isLowerCase(name.charAt(i)) == true) {
			conditionLower = true;
			}
			if(name.matches(".*\\d+.*")) {
			conditionNum = true;
			}
			if(Character.isWhitespace(name.charAt(i)) == true) {
			conditionWS = true;
			} 
			if(Character.isLetterOrDigit(name.charAt(i)) == false) {
			conditionSpc = true;
			}
		}
		
		if(conditionWS == true) {
			System.out.println("Das Passwort ist ungültig! Bitte geben sie ein neues Passwort ohne Leerzeichen ein: "); 
			System.exit(0);
			}
		
		if(!conditionWS && conditionNum && conditionLower && conditionUp && conditionLength && conditionSpc) {
			System.out.println("Das von Ihnen gewählte Passwort ist sicher.");
		}else {
			System.out.println("Das von Ihnen gewählte Passwort ist nicht sicher. Bite versuchen Sie es erneut.");
		}
		
		}
		
		
		
	}
	
	



//Teste eingegebenes Passwort auf Stärke
		//Ein starkes Passwort muss die folgenden Eigenschaften haben:
		//1: Mindestens 8 Zeichen 2: Mindestens einen Großbuchstaben 3: Mindestens ein Sonderzeichen (_, - , !, #) 4:Mindestens eine Zahl
		//5: mindestens ein kleiner Buchstabe und ein Passwort darf keine leerzeichenaufweisen
		