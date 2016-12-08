/**
 * Created by jlaba on 28.11.2016.
 */
public class WorkDailyPassWithoutNumbersOfUps extends SkiPass {

    public WorkDailyPassWithoutNumbersOfUps(DaysSpec spec) {
        super(spec);
    }

    public int tellItLikeItIs() {
        System.out.println("You use daily pass, not ups");
        return 1;
    }
}
