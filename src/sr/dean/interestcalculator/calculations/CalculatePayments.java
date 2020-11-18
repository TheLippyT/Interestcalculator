package sr.dean.interestcalculator.calculations;

import java.util.Scanner;

public class CalculatePayments {
    public void Calculate()

    {
        double verkoopprijs, aanbetaling, financieringsbedrag, rente, totaleRente, totaalPlusRente, maandelijkseAflossing, looptijdInMaanden, looptijdInJaren;

        Scanner scanner = new Scanner(System.in);

        System.out.println("insert verkoopprijs:");
        verkoopprijs = scanner.nextDouble();

        System.out.println("insert looptijd:");
        looptijdInJaren = scanner.nextDouble();

        System.out.println("insert aanbetaling:");
        aanbetaling = scanner.nextDouble();

        System.out.println("insert jaarlijkse rente:");
        rente = scanner.nextDouble();

        financieringsbedrag = verkoopprijs - aanbetaling;
        totaleRente = (financieringsbedrag * (rente / 100)) * looptijdInJaren;
        totaalPlusRente = totaleRente + financieringsbedrag;
        looptijdInMaanden = looptijdInJaren * 12;
        maandelijkseAflossing = totaalPlusRente / looptijdInMaanden;

        System.out.println("looptijd in jaren: " + looptijdInJaren);
        System.out.println("looptijd in maanden: " + looptijdInMaanden);
        System.out.println("verkoopprijs: " + verkoopprijs);
        System.out.println("aanbetaling: " + aanbetaling);
        System.out.println("finacieringsbedrag: " + financieringsbedrag);
        System.out.println("rente: " + rente);
        System.out.println("totaal rente: " + totaleRente);
        System.out.println("totaal inclusief rente: " + totaalPlusRente);
        System.out.println("maandelijkse aflossing: " + maandelijkseAflossing);
    }

}
