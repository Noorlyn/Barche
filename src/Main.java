import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
		
		
	    Barca B = new Barca();
		B.Domande();
		

		System.out.println("Sono queste informazioni corrette? si o no");
		Scanner Scan = new Scanner(System.in);
		String answer = Scan.nextLine();

		if(answer == "no")
		{
			while(answer == "no")
			{
				B.Domande();
				System.out.println("Sono corrette le informazioni adesso? si o no");
				answer = Scan.nextLine();
			}
		}

		Porto P = new Porto(null, null, null);
		
		Scan.close();
	}
}