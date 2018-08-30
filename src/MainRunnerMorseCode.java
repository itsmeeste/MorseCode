
public class MainRunnerMorseCode {

	public static void main(String [] args)
	{
	MorseCode code = new MorseCode(); 
	
	System.out.println("Enter Code to be deciphered!");
	code.keyMorse();
	code.findWord();
	System.out.println("");
	System.out.println("Enter Text to be encripted!");
	code.valueMorse();
	code.codeWord(); 
	
	}
	
	}
