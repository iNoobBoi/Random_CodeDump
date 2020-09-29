import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Decode {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the file name which the message was stored in: ");
		String fileName = input.nextLine();
		input.close();
		
		try (
			ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)));
			) {
			EncodedMessage myMessage = (EncodedMessage) in.readObject();
			System.out.print("DECODED MESSAGE: ");
			System.out.println(myMessage.decode());
			}
		}
	}
