/**
 * Created by jlaba on 08.12.2016.
 */
public class SkiStore{
    SimpleSkiFactory factory;
    public SkiStore(SimpleSkiFactory factory) {
        this.factory = factory;
    }
    public SkiPass orderSki(String type) {
        SkiPass pass;
        pass = factory.createSki(type);
        return pass;

}
}
