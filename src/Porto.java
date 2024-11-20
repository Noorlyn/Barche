import java.util.*;

public class Porto {

    ArrayList<String> posti = new ArrayList<String>();

    void Posizioni(ArrayList<String> posti)
    {

        for (int i = 1; i <= 100; i++) 
        {
            posti.add(i, " ");
            i++;
            posti.add(i, "occupato");
        }

    }

    Porto(String Lunghezza_Barca, String Tipologia_Barca, ArrayList<String> posti)
    {
        if (Tipologia_Barca == "vela" || Tipologia_Barca == "Vela")
        {
            for (int i = 50; i <= 100; i++ )
            {
                if (posti(i) == "occupato")
                {
                    System.out.println("questo posto è occupato, cercheremo un altro");
                }
                else
                {
                    posti.add(i, "posto assegnato");
                }
            }
            
            
        }
    }

    public void Porto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Porto'");
    }

    
    
}
