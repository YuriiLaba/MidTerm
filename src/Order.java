/**
 * Created by jlaba on 28.11.2016.
 */
public class Order {
    public static void main(String[] args) {
        //UpsSpec spec = new UpsSpec(11, 23);
        //SkiPass pass1 = new WeekendPassWithNumbersOfUps(spec, NumbersOfUps.TEN);
        //pass1.tellItLikeItIs();
        //pass1.tellItLikeItIs();
        //DaysSpec spec1 = new DaysSpec(11, 23, NumbersOfDays.FIVE);
        //SkiPass pass2 = new WeekendPassWithoutNumbersOfUps(spec1);
        //pass2.tellItLikeItIs();
        SkiStore store = new SkiStore(new SimpleSkiFactory());
        store.orderSki("WeekendPassWithNumbersOfUps");

    }

}
