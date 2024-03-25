package pattern.ex03;

/**
 * 어뎁터 패턴
 * : 외부 요소를 기존 시스템에 재사용하고 싶지만 아직 만들어지지 않은 경우(FakeAdapter) -> OuterTiger가 아직 만들어지지 않음
 * : 외부 요소를 기존 시스템에 재사용하고 싶지만 호환되지 않은 경우
 */
public class App {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();
        DoorMan dm = new DoorMan();
        TigerAdapter ta = new TigerAdapter(new OuterTiger());
        dm.쫓아내(m);
        dm.쫓아내(c);
        dm.쫓아내(ta);
    }
}
