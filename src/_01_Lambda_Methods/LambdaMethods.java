package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {

		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustomMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			 String finString="";
			for(int i = s.length(); i >0; i--) {
				finString=finString+s.charAt(i);
				System.out.println(finString);
			}
		}, "repeat");
		//3. Call the printCustomMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			 String finString2="";
			for(int i = 0; i < s.length(); i++) {
				if(i%2==0) {
					Character.toUpperCase(s.charAt(i));
					finString2=finString2+s.charAt(i);
				}else {
					finString2=finString2+s.charAt(i);
				}
				
			}
			System.out.println(finString2);
		}, "repeat");
		//4. Call the printCustomMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			 String finString3="";
			for(int i = 0; i < s.length(); i++) {
					finString3=finString3+s.charAt(i);
					finString3=finString3+".";
			}
			System.out.println(finString3);
		}, "repeat");
		//5. Call the printCustomMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			 String finString4="";
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
					finString4=finString4+s.charAt(i);
				}
			}
			System.out.println(finString4);
		}, "repeat");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
