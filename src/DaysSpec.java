/**
 * Created by jlaba on 28.11.2016.
 */
public class DaysSpec extends Spec {
    protected NumbersOfDays days;

    public DaysSpec(double identitcalNumber, double price, double popularity, NumbersOfDays days) {
        super(identitcalNumber, price, popularity);
        this.days = days;
    }
}
