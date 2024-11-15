import java.util.Scanner;

public class Barca {

    Scanner risposte = new Scanner(System.in);
    String Nome_Barca;
    String Nazionalità_Barca;
    String Lunghezza_Barca;
    String Stazza_Barca;
    String Tipologia_Barca;


    public void Domande()
    {
        System.out.println("Bemvenuto, per favore compila queste informazioni" + "\n");
		
		System.out.println("\nNome barca: ");
		Nome_Barca = risposte.nextLine();
		
		System.out.println("\nNazionalità: ");
		Nazionalità_Barca = risposte.nextLine();
		
		System.out.println("\nLunghezza: ");
		Lunghezza_Barca = risposte.nextLine();
		
		System.out.println("\nStazza: ");
		Stazza_Barca = risposte.nextLine();
		
		System.out.println("\nTipologia: (vela o motore)");
		Tipologia_Barca = risposte.nextLine();

        System.out.println("Nome Barca: " + Nome_Barca);
        System.out.println("Nazionalità: " + Nazionalità_Barca);
        System.out.println("Lunghezza: " + Lunghezza_Barca);
        System.out.println("Stazza: " + Stazza_Barca);
        System.out.println("Tipologia: " + Tipologia_Barca);

        risposte.close();

    }

    

    
}
