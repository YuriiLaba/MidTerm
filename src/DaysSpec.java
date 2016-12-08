/**
 * Created by jlaba on 28.11.2016.
 */
public class DaysSpec extends Spec {
    protected NumbersOfDays days;

    public DaysSpec(double price, double popularity, NumbersOfDays days) {
        super(price, popularity);
        this.days = days;
    }
}
