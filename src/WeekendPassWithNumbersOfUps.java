/**
 * Created by jlaba on 28.11.2016.
 */
public class WeekendPassWithNumbersOfUps extends SkiPass {
    NumbersOfUps ups;
    public int number;
    public WeekendPassWithNumbersOfUps(UpsSpec spec, NumbersOfUps ups) {
        super(spec);
        this.ups = ups;
        switch (ups) {
            case TEN:
                this.number = 10;
                break;

            case TWENTY:
                this.number = 20;
                break;

            case FIFTY:
                this.number = 50;
                break;
            case ONE_HUNDRED:
                this.number = 100;
                break;
        }
    }

    @Override
    public int tellItLikeItIs() {
        switch (ups) {
            case TEN:
                number = number - 1;
                break;

            case TWENTY:
                number = number - 1;
                break;

            case FIFTY:
                number = number - 1;
                break;
            case ONE_HUNDRED:
                number = number - 1;
                break;


        }
        return number;
    }
}
