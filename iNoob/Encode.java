import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Encode {
	public static void main(String[] args) throws IOException {
		Scanner Input = new Scanner(System.in);
		System.out.println("MagicSquirrel Encoder v.1.5 English version.\nCurrently supporting letters, numbers, and 15 commonly used symbols.");
		System.out.print("Enter the secret message you wish to encode: ");
		String message = Input.nextLine();

		int [] numbers = {
			1,
			2,
			3,
			4,
			5,
			6,
			7,
			8,
			9,
			10,
			11,
			12,
			13,
			14,
			15,
			16,
			17,
			18,
			19,
			20,
			21,
			22,
			23,
			24,
			25,
			26,
			28,
			29,
			30,
			31,
			32,
			33,
			34,
			35,
			36,
			37,
			38,
			39,
			40,
			41,
			42,
			43,
			44,
			45,
			46,
			47,
			48,
			49,
			50,
			51,
			52,
			53,
			54,
			55,
			56,
			57,
			58,
			59,
			60,
			61,
			62,
			63,
			64,
			65,
			66,
			67,
			68,
			69,
			70,
			71,
			72,
			73,
			74,
			75,
			76,
			77
			};
			
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the file name to store your message in: ");
		String fileName = input.nextLine();
		fileName += ".dat";
		Input.close();
		input.close();

		try (
			ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
			) {

			EncodedMessage myMessage = new EncodedMessage(numbers, message);
			myMessage.encode();

			out.writeObject(myMessage);
		}
	}
	}