import java.util.Scanner;

public class javaProject_ProjectOne {
	public static void main(String []args) {
		//Java Project File; Project One
		//In answer to Assignment 9 I would use the same for loop as used here for any incorrect inputs and for no input
		//I don't know why it would return 1, maybe the initial value of the variable is 1? I don't know.
		
		//For Assignment 10, thanks for the feedback, I will keep that in mind for the next unit and for when I'm working with java in the future.
		Scanner input = new Scanner(System.in); //Scanner
		
		System.out.println("Hello! This is a Totally Useful Program! I am here to encode and decode secret messages for you!");
		
		for (int i = 0; i <= 1; i--) {
			System.out.println("Enter 0 to encode a message and 1 to decode a message: "); //user interface
			int userChoice = input.nextInt();
			if (userChoice == 0) {
				Scanner inPut = new Scanner(System.in); //Another Scanner
				System.out.print("Enter the sentence you wish to encode: ");
				String userInput = inPut.nextLine(); //gets sentence
				System.out.println("Your encoded message is: \"" + enCode(userInput) + "\""); //output
				i = 2; //exit loop
				} //interface for encoding
			else if (userChoice == 1) {
				Scanner Input = new Scanner(System.in); //Yet Another Scanner
				System.out.print("Enter the sentence you wish to decode: ");
				String userInput = Input.nextLine(); //gets sentence
				System.out.println("Your decoded message is: \"" + deCode(userInput) + "\""); //output
				i = 2; //exit loop
				} //interface for decoding
			else {
				System.out.println("Invalid input.");
				} //anti-troll
			} //infinite loop for continuity
		} //decider for what to execute
	
	public static String enCode(String userInput) {
		String inputArray[] = userInput.split(""); //splits the input sentence into an array for individual character conversion
		for (int j = 0; j < inputArray.length; j++) {
			switch (inputArray[j]) {
				case "a":
					inputArray[j] = "z";
					break;
				case "b":
					inputArray[j] = "y";
					break;
				case "c":
					inputArray[j] = "x";
					break;
				case "d":
					inputArray[j] = "w";
					break;
				case "e":
					inputArray[j] = "v";
					break;
				case "f":
					inputArray[j] = "u";
					break;
				case "g":
					inputArray[j] = "t";
					break;
				case "h":
					inputArray[j] = "s";
					break;
				case "i":
					inputArray[j] = "r";
					break;
				case "j":
					inputArray[j] = "q";
					break;
				case "k":
					inputArray[j] = "p";
					break;
				case "l":
					inputArray[j] = "o";
					break;
				case "m":
					inputArray[j] = "n";
					break;
				case "n":
					inputArray[j] = "m";
					break;
				case "o":
					inputArray[j] = "l";
					break;
				case "p":
					inputArray[j] = "k";
					break;
				case "q":
					inputArray[j] = "j";
					break;
				case "r":
					inputArray[j] = "i";
					break;
				case "s":
					inputArray[j] = "h";
					break;
				case "t":
					inputArray[j] = "g";
					break;
				case "u":
					inputArray[j] = "f";
					break;
				case "v":
					inputArray[j] = "e";
					break;
				case "w":
					inputArray[j] = "d";
					break;
				case "x":
					inputArray[j] = "c";
					break;
				case "y":
					inputArray[j] = "b";
					break;
				case "z":
					inputArray[j] = "a";
					break;
				case "A":
					inputArray[j] = "Z";
					break;
				case "B":
					inputArray[j] = "Y";
					break;
				case "C":
					inputArray[j] = "X";
					break;
				case "D":
					inputArray[j] = "W";
					break;
				case "E":
					inputArray[j] = "V";
					break;
				case "F":
					inputArray[j] = "U";
					break;
				case "G":
					inputArray[j] = "T";
					break;
				case "H":
					inputArray[j] = "S";
					break;
				case "I":
					inputArray[j] = "R";
					break;
				case "J":
					inputArray[j] = "Q";
					break;
				case "K":
					inputArray[j] = "P";
					break;
				case "L":
					inputArray[j] = "O";
					break;
				case "M":
					inputArray[j] = "N";
					break;
				case "N":
					inputArray[j] = "M";
					break;
				case "O":
					inputArray[j] = "L";
					break;
				case "P":
					inputArray[j] = "K";
					break;
				case "Q":
					inputArray[j] = "J";
					break;
				case "R":
					inputArray[j] = "I";
					break;
				case "S":
					inputArray[j] = "H";
					break;
				case "T":
					inputArray[j] = "G";
					break;
				case "U":
					inputArray[j] = "F";
					break;
				case "V":
					inputArray[j] = "E";
					break;
				case "W":
					inputArray[j] = "D";
					break;
				case "X":
					inputArray[j] = "C";
					break;
				case "Y":
					inputArray[j] = "B";
					break;
				case "Z":
					inputArray[j] = "A";
					break;
				case "`":
					inputArray[j] = "`";
					break;
				case "1":
					inputArray[j] = "1";
					break;
				case "2":
					inputArray[j] = "2";
					break;
				case "3":
					inputArray[j] = "3";
					break;
				case "4":
					inputArray[j] = "4";
					break;
				case "5":
					inputArray[j] = "5";
					break;
				case "6":
					inputArray[j] = "6";
					break;
				case "7":
					inputArray[j] = "7";
					break;
				case "8":
					inputArray[j] = "8";
					break;
				case "9":
					inputArray[j] = "9";
					break;
				case "0":
					inputArray[j] = "0";
					break;
				case "~":
					inputArray[j] = "~";
					break;
				case "!":
					inputArray[j] = "!";
					break;
				case "@":
					inputArray[j] = "@";
					break;
				case "#":
					inputArray[j] = "#";
					break;
				case "$":
					inputArray[j] = "$";
					break;
				case "%":
					inputArray[j] = "%";
					break;
				case "^":
					inputArray[j] = "^";
					break;
				case "&":
					inputArray[j] = "&";
					break;
				case "*":
					inputArray[j] = "*";
					break;
				case "(":
					inputArray[j] = "(";
					break;
				case ")":
					inputArray[j] = ")";
					break;
				case "-":
					inputArray[j] = "-";
					break;
				case "_":
					inputArray[j] = "_";
					break;
				case "=":
					inputArray[j] = "=";
					break;
				case "+":
					inputArray[j] = "+";
					break;
				case "[":
					inputArray[j] = "[";
					break;
				case "]":
					inputArray[j] = "]";
					break;
				case "{":
					inputArray[j] = "{";
					break;
				case "}":
					inputArray[j] = "}";
					break;
				case "\\":
					inputArray[j] = "\\";
					break;
				case "|":
					inputArray[j] = "|";
					break;
				case ";":
					inputArray[j] = ";";
					break;
				case ":":
					inputArray[j] = ":";
					break;
				case "'":
					inputArray[j] = "'";
					break;
				case "\"":
					inputArray[j] = "\"";
					break;
				case ",":
					inputArray[j] = ",";
					break;
				case "<":
					inputArray[j] = "<";
					break;
				case ".":
					inputArray[j] = ".";
					break;
				case ">":
					inputArray[j] = ">";
					break;
				case "/":
					inputArray[j] = "/";
					break;
				case "?":
					inputArray[j] = "?";
					break;
				case " ":
					inputArray[j] = " ";
					break;
				default:
					inputArray[j] = " ";
					break;
				}
			} //encodes every single keyboard character and returns an error message for unknown characters
			return String.join("", inputArray);
		} //encoder for sentence
		
	public static String deCode(String userInput) {
		String inputArray[] = userInput.split(""); //splits the input sentence into an array for individual character conversion
		for (int h = 0; h < inputArray.length; h++) {
			switch (inputArray[h]) {
				case "a":
					inputArray[h] = "z";
					break;
				case "b":
					inputArray[h] = "y";
					break;
				case "c":
					inputArray[h] = "x";
					break;
				case "d":
					inputArray[h] = "w";
					break;
				case "e":
					inputArray[h] = "v";
					break;
				case "f":
					inputArray[h] = "u";
					break;
				case "g":
					inputArray[h] = "t";
					break;
				case "h":
					inputArray[h] = "s";
					break;
				case "i":
					inputArray[h] = "r";
					break;
				case "j":
					inputArray[h] = "q";
					break;
				case "k":
					inputArray[h] = "p";
					break;
				case "l":
					inputArray[h] = "o";
					break;
				case "m":
					inputArray[h] = "n";
					break;
				case "n":
					inputArray[h] = "m";
					break;
				case "o":
					inputArray[h] = "l";
					break;
				case "p":
					inputArray[h] = "k";
					break;
				case "q":
					inputArray[h] = "h";
					break;
				case "r":
					inputArray[h] = "i";
					break;
				case "s":
					inputArray[h] = "h";
					break;
				case "t":
					inputArray[h] = "g";
					break;
				case "u":
					inputArray[h] = "f";
					break;
				case "v":
					inputArray[h] = "e";
					break;
				case "w":
					inputArray[h] = "d";
					break;
				case "x":
					inputArray[h] = "c";
					break;
				case "y":
					inputArray[h] = "b";
					break;
				case "z":
					inputArray[h] = "a";
					break;
				case "A":
					inputArray[h] = "Z";
					break;
				case "B":
					inputArray[h] = "Y";
					break;
				case "C":
					inputArray[h] = "X";
					break;
				case "D":
					inputArray[h] = "W";
					break;
				case "E":
					inputArray[h] = "V";
					break;
				case "F":
					inputArray[h] = "U";
					break;
				case "G":
					inputArray[h] = "T";
					break;
				case "H":
					inputArray[h] = "S";
					break;
				case "I":
					inputArray[h] = "R";
					break;
				case "J":
					inputArray[h] = "Q";
					break;
				case "K":
					inputArray[h] = "P";
					break;
				case "L":
					inputArray[h] = "O";
					break;
				case "M":
					inputArray[h] = "N";
					break;
				case "N":
					inputArray[h] = "M";
					break;
				case "O":
					inputArray[h] = "L";
					break;
				case "P":
					inputArray[h] = "K";
					break;
				case "Q":
					inputArray[h] = "h";
					break;
				case "R":
					inputArray[h] = "I";
					break;
				case "S":
					inputArray[h] = "H";
					break;
				case "T":
					inputArray[h] = "G";
					break;
				case "U":
					inputArray[h] = "F";
					break;
				case "V":
					inputArray[h] = "E";
					break;
				case "W":
					inputArray[h] = "D";
					break;
				case "X":
					inputArray[h] = "C";
					break;
				case "Y":
					inputArray[h] = "B";
					break;
				case "Z":
					inputArray[h] = "A";
					break;
				case "`":
					inputArray[h] = "`";
					break;
				case "1":
					inputArray[h] = "1";
					break;
				case "2":
					inputArray[h] = "2";
					break;
				case "3":
					inputArray[h] = "3";
					break;
				case "4":
					inputArray[h] = "4";
					break;
				case "5":
					inputArray[h] = "5";
					break;
				case "6":
					inputArray[h] = "6";
					break;
				case "7":
					inputArray[h] = "7";
					break;
				case "8":
					inputArray[h] = "8";
					break;
				case "9":
					inputArray[h] = "9";
					break;
				case "0":
					inputArray[h] = "0";
					break;
				case "~":
					inputArray[h] = "~";
					break;
				case "!":
					inputArray[h] = "!";
					break;
				case "@":
					inputArray[h] = "@";
					break;
				case "#":
					inputArray[h] = "#";
					break;
				case "$":
					inputArray[h] = "$";
					break;
				case "%":
					inputArray[h] = "%";
					break;
				case "^":
					inputArray[h] = "^";
					break;
				case "&":
					inputArray[h] = "&";
					break;
				case "*":
					inputArray[h] = "*";
					break;
				case "(":
					inputArray[h] = "(";
					break;
				case ")":
					inputArray[h] = ")";
					break;
				case "-":
					inputArray[h] = "-";
					break;
				case "_":
					inputArray[h] = "_";
					break;
				case "=":
					inputArray[h] = "=";
					break;
				case "+":
					inputArray[h] = "+";
					break;
				case "[":
					inputArray[h] = "[";
					break;
				case "]":
					inputArray[h] = "]";
					break;
				case "{":
					inputArray[h] = "{";
					break;
				case "}":
					inputArray[h] = "}";
					break;
				case "\\":
					inputArray[h] = "\\";
					break;
				case "|":
					inputArray[h] = "|";
					break;
				case ";":
					inputArray[h] = ";";
					break;
				case ":":
					inputArray[h] = ":";
					break;
				case "'":
					inputArray[h] = "'";
					break;
				case "\"":
					inputArray[h] = "\"";
					break;
				case ",":
					inputArray[h] = ",";
					break;
				case "<":
					inputArray[h] = "<";
					break;
				case ".":
					inputArray[h] = ".";
					break;
				case ">":
					inputArray[h] = ">";
					break;
				case "/":
					inputArray[h] = "/";
					break;
				case "?":
					inputArray[h] = "?";
					break;
				case " ":
					inputArray[h] = " ";
					break;
				default:
					inputArray[h] = " ";
					break;
				}
			} //decodes every single keyboard character and returns an error message for unknown characters
			return String.join("", inputArray);
		} //decoder for sentence
	}