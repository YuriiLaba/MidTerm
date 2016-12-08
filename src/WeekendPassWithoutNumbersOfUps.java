/**
 * Created by jlaba on 28.11.2016.
 */

public class WeekendPassWithoutNumbersOfUps extends SkiPass {

    public WeekendPassWithoutNumbersOfUps(DaysSpec spec) {
        super(spec);
    }

    @Override
    public int tellItLikeItIs() {
        System.out.println("You use daily pass, not ups");
        return 1;
    }
}
