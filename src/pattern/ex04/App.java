package pattern.ex04;

/**
 * 싱글톤 패턴
 */
public class App {
    public static void main(String[] args) {
        DoorMan doorMan = DoorMan.getInstance();
        // DoorMan doorMan2 = new DoorMan(); <- 안됨.
        doorMan.쫓아내(new Cat());
    }
}
