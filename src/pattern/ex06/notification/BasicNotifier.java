package pattern.ex06.notification;

// 래퍼가 없는 데코레이터
// 이 클래스가 있어야 마무리 됨
public class BasicNotifier implements Notifier {

    // 이 친구는 뭔가를 의존하면 안됨.

    @Override
    public void send(){
        System.out.println("기본 알림");
    }
}
