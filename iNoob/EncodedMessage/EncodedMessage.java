import java.io.Serializable;
import java.util.Random;

public class EncodedMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	public String [] encoderAlpha = {
		"a",
		"b",
		"c",
		"d",
		"e",
		"f",
		"g",
		"h",
		"i",
		"j",
		"k",
		"l",
		"m",
		"n",
		"o",
		"p",
		"q",
		"r",
		"s",
		"t",
		"u",
		"v",
		"w",
		"x",
		"y",
		"z",
		"A",
		"B",
		"C",
		"D",
		"E",
		"F",
		"G",
		"H",
		"I",
		"J",
		"K",
		"L",
		"M",
		"N",
		"O",
		"P",
		"Q",
		"R",
		"S",
		"T",
		"U",
		"V",
		"W",
		"X",
		"Y",
		"Z",
		"'",
		"\"",
		"!",
		".",
		",",
		"#",
		"@",
		"$",
		"&",
		":",
		"(",
		")",
		"?",
		"%",
		"-",
		"+",
		"0",
		"1",
		"2",
		"3",
		"4",
		"5",
		"6",
		"7",
		"8",
		"9"
		};
	
	public String[] alphabet = new String[encoderAlpha.length];

	public int [] keys = new int[encoderAlpha.length];

	public String message = "";
	public String [] Message = null;
	
	//CONSTRUCTOR
	public EncodedMessage(int [] userKeys, String userMessage) {
		for (int i = 0; i < userKeys.length; i++) {
			this.keys[i] = userKeys[i];
			}
		this.keys = randomize(this.keys, this.keys.length - 1);
		this.message = userMessage;
		this.encoderAlpha = randomizeString(this.encoderAlpha, this.encoderAlpha.length - 1);
		
		for (int i = 0; i < this.keys.length; i++) {
			this.alphabet[i] = (String) this.encoderAlpha[keys[i]];
			}
		
		this.alphabet = randomizeString(this.alphabet, this.alphabet.length - 1);
		}
	
	//SETTER METHODS
	public void setMessage(String newMessage) {
		this.message = newMessage;
		}
	
	//GETTER METHODS
	public String getMessage() {
		return this.message;
		}
	
	//CODING METHODS
	public void encode() {
		this.Message = this.message.split("");
		this.message = "";
		for (int i = 0; i < this.Message.length; i++) {
			if (this.Message[i].equals(" ")) {
				this.message += " ";
				}
			else {
				for (int j = 0; j < this.encoderAlpha.length; j++) {
					if (this.Message[i].equals((String) this.encoderAlpha[j])) {
						this.message += this.alphabet[j];
						}
					}
				}
			}
		this.Message = this.message.split("");
		}
	
	public String decode() {
		this.Message = this.message.split("");
		this.message = "";
		for (int i = 0; i < this.Message.length; i++) {
			if (this.Message[i].equals(" ")) {
				this.message += " ";
				}
			else {
				for (int j = 0; j < this.encoderAlpha.length; j++) {
					if (this.Message[i].equals(this.alphabet[j])) {
						this.message += (String) this.encoderAlpha[j];
						}
					}
				}
			}
		
		return this.message;
		}
	
		public static int[] randomize(int[] numbers, int randomizer) {
			Random random = new Random();
			int temp;
			for (int i = 0; i < 1000; i++) {
				int posOne = random.nextInt(randomizer);
				int posTwo = random.nextInt(randomizer);
				temp = numbers[posTwo];
				numbers[posTwo] = numbers[posOne];
				numbers[posOne] = temp;
				}
			return numbers;
		}
		
		public static String[] randomizeString(String[] words, int randomizer) {
			Random random = new Random();
			String temp;
			for (int i = 0; i < 1000; i++) {
				int posOne = random.nextInt(randomizer);
				int posTwo = random.nextInt(randomizer);
				temp = words[posTwo];
				words[posTwo] = words[posOne];
				words[posOne] = temp;
				}
			return words;
		}
	}
