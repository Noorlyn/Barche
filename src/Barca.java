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

    public int Menu()
    {
        Scanner Answer = new Scanner(System.in);
        System.out.println("Cosa desidera fare adesso?\n\n");
        System.out.println("(1)Prendere un posto\n");
        System.out.println("(2)Andarsene e pagare\n");
        System.out.println("(3) Sapere le informazioni della barca in un posto\n");
        System.out.println("(4) Arrivederci e alla prossima\n\n");
        int numero = Answer.nextInt();
        return numero;
        
    }

    
}
