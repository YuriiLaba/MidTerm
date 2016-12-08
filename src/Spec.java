

/**
 * Created by jlaba on 28.11.2016.
 */
public class Spec {
    protected double identitcalNumber;
    protected double price;
    protected double popularity = 0;

    static int i = 0;


    public Spec(double price, double popularity) {
        this.identitcalNumber = i++;
        this.price = price;
        this.popularity = popularity;
    }
}
