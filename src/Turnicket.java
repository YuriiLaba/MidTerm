import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by jlaba on 28.11.2016.
 */
public class Turnicket {

    public String minusUP(SkiPass pass) {
        if(pass.tellItLikeItIs() < 0){
            return "You aren't able to go. Your card is blocked";
        }else{
            return "You are able to go";
        }
    }

}
