/**
 * Created by jlaba on 28.11.2016.
 */
public class UpsSpec extends Spec {
    protected NumbersOfUps ups;

    public UpsSpec(double identitcalNumber, double price, double popularity, NumbersOfUps ups) {
        super(identitcalNumber, price, popularity);
        this.ups = ups;
    }
}
