package rmiClient;

import java.rmi.Naming;
import rmiService.IConversion;

public class ConversionClient {
    public static void main(String[] args) {
        try {
            // ii. chercher la référence de l'objet distant dans l'annuaire
            IConversion conversion =
                    (IConversion) Naming.lookup("rmi://localhost:1099/ConversionService");

            // iii. invoquer la méthode distante
            double resultat = conversion.convertirMontant(500);
            System.out.println("500 EUR = " + resultat + " TND");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}