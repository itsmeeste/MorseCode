import java.util.HashMap;
import java.util.Scanner;

public class MorseCode {

	HashMap <String, Character> morse = new HashMap <String, Character>();
	HashMap <Character, String> orse = new HashMap <Character, String>();
	Scanner sc = new Scanner(System.in);
	
	private String input; 
	private String output;
	
	public void keyMorse()
	{
		morse.put(".-", 'A');
		morse.put("-...", 'B');
		morse.put("-.-.", 'C');
		morse.put("-..", 'D');
		morse.put(".",  'E');
		morse.put("..-.", 'F');
		morse.put("--.", 'G');
		morse.put("....",'H');
		morse.put("..",'I');
		morse.put(".---",'J');
		morse.put("-.-",'K');
		morse.put(".-..",'L');
		morse.put("--",'M');
		morse.put("-.",'N');
		morse.put("---",'O');
		morse.put(".--.",'P');
		morse.put("--.-",'Q');
		morse.put(".-.",'R');
		morse.put("...",'S');
		morse.put("-",'T');
		morse.put("..-",'U');
		morse.put("...-",'V');
		morse.put(".--",'W');
		morse.put("-..-",'X');
		morse.put("-.--",'Y');
		morse.put("--..",'Z');
		// morse.put(" /", ' ');
		
		}
	
	public void valueMorse()
	{
		orse.put('A', ".-");
		orse.put('B', "-...");
		orse.put('C', "-.-.");
		orse.put('D', "-..");
		orse.put('E', ".");
		orse.put('F', "..-.");
		orse.put('G', "--.");
		orse.put('H', "....");
		orse.put('I', "..");
		orse.put('J', ".---");
		orse.put('K', "-.-");
		orse.put('L', ".-..");
		orse.put('M', "--");
		orse.put('N', "-.");
		orse.put('O', "---");
		orse.put('P', ".--.");
		orse.put('Q', "--.-");
		orse.put('R', ".-.");
		orse.put('S', "...");
		orse.put('T', "-");
		orse.put('U', "..-");
		orse.put('V', "...-");
		orse.put('W', ".--");
		orse.put('X', "-..-");
		orse.put('Y', "-.--");
		orse.put('Z', "--..");
			}
	
	
	public void findWord()
	{
		input = sc.nextLine();
		String [] wordList = input.split(" /");
		for(String s : wordList)
		{
			String [] letterList = s.split(" ");
			for(String l : letterList)
			{
				if(morse.get(l) != null)
				{
					System.out.print(morse.get(l));
				}
			
			}
		System.out.print(" ");
		}
	
	}
	
	public void codeWord()
	{
		output = sc.nextLine();
		String [] outList = output.split(" ");
		for(String w : outList)
		{
			char [] letterChange = w.toCharArray();
			for (char e : letterChange)
			{
				System.out.print(orse.get(e));
				System.out.print(" ");
			}
		
		System.out.print(" /");
		}
	}
	
	}
