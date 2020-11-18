package sr.dean.interestcalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double verkoopprijs,aanbetaling,financieringsbedrag,rente,totaleRente,totaalPlusRente,maandelijkseAflossing, looptijd;

	    Scanner scanner = new Scanner(System.in);

        System.out.println("insert verkoopprijs:");
	    verkoopprijs = scanner.nextFloat();

        System.out.println("insert looptijd:");
        looptijd = scanner.nextFloat();

        System.out.println("insert aanbetaling:");
        aanbetaling = scanner.nextFloat();

        System.out.println("insert looptijd");

        simpleInterest = (principle * numberOfYears * rate) /100;

        System.out.println("the interest amount = " + simpleInterest);
    }
}
