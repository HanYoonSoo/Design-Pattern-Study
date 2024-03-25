package pattern.ex04;

/*
 * 문지기를 딱 한명만 만들고 싶다.
 */
public class DoorMan {

    // 자바에서 static은 main 메서드를 호출하기 전에 JVM에 읽어서 메모리에 올라오는 친구
    private static DoorMan doorMan = new DoorMan();

    // static을 하지 않으면 DoorMan에 접근할 수 없다. 이유: 생성자가 private이기 때문.
    public static DoorMan getInstance(){  // heap이 관리하는 메서드
        return doorMan;
    }

    private DoorMan() {

    }

    public void 쫓아내(Animal a){
        System.out.println(a.getName() + " 쫓아내");
    }
}
