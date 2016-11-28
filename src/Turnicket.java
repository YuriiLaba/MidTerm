import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by jlaba on 28.11.2016.
 */
public class Turnicket {
    private int max = 5;
    private SkiPass[] listOfPass = new SkiPass[max];
    private int i = 0;

    public SkiPass[] add(SkiPass pass){
        listOfPass[i] = pass;
        i++;
        return listOfPass;
    }

    public String minusUP(SkiPass pass) {
        for(int i = 0; i < listOfPass.length; i++){
            if ( pass == listOfPass[i] ){
                return "Мінус один проїз";
            }
        }
        return "";
    }
//Треба ще додати декоратор, який би через не виконання певних умов декоровав би елемент списку
//наприклад він би став іншого типу і коли б я проходив по списку то елемент був би іншого типу і тоді я б ретурнив що
//цей білет непрацює
}
