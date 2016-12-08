import java.util.Scanner;

/**
 * Created by jlaba on 07.12.2016.
 */
public class SimpleSkiFactory {
    public SkiPass createSki(String type) {
        SkiPass pass = null;
        if (type.equals("WeekendPassWithNumbersOfUps")) {
            Scanner price = new Scanner(System.in);
            System.out.println("Enter a price, which you want to put on the pass: ");
            int price_input = price.nextInt();

            Scanner popularity = new Scanner(System.in);
            System.out.println("Enter you mark about pass: ");
            int popularity_input = popularity.nextInt();

            Scanner numberOfUps = new Scanner(System.in);
            System.out.println("Choose: TEN, TWENTY, FIFTY, ONE_HUNDRED");
            String numberOfUps_input = numberOfUps.next();

            UpsSpec spec = new UpsSpec(price_input, popularity_input);
            pass = new WeekendPassWithNumbersOfUps(spec, NumbersOfUps.TEN);

        }
        return pass;
    }
}
