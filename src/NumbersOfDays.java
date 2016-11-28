/**
 * Created by jlaba on 28.11.2016.
 */
public enum NumbersOfDays {
    ONE, TWO, FIVE;
    public String toString(){
        String a = "";
        switch(this){
            case ONE: a = "1"; break;
            case TWO: a = "2"; break;
            case FIVE: a = "5"; break;
            default: a = "Abonement"; break;
        }return a;
    }

}
