/**
 * Created by jlaba on 28.11.2016.
 */
public enum NumbersOfUps {
    TEN, TWENTY, FIFTY, ONE_HUNDRED;
    public String toString(){
        String a = "";
        switch(this){
            case TEN: a = "10"; break;
            case TWENTY: a = "20"; break;
            case FIFTY: a = "50"; break;
            case ONE_HUNDRED: a = "100"; break;
            default: a = "Abonement"; break;
        }return a;
    }
}
