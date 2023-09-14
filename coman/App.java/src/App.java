import coman.ConcreteComand;
import coman.ConcreteReciver;
import coman.Inveker;

public class App {
    public static void main(String[] args) throws Exception {
        Inveker inveker = new Inveker();
        ConcreteReciver reciver = new ConcreteReciver();

        inveker.excutecomaman( new ConcreteComand(), reciver);
    }
}
