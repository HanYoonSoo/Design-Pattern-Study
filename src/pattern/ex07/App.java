package pattern.ex07;

public class App {
    public static void main(String[] args) {
        // 싱글톤 제작
        DBFactory dbFactory = DBFactory.getInstance();

        // 내가 MariaDB 객체를 알 필요가 없음
        // setURL 부터 해야 할지, execute 부터 해야 할지 생각할 필요가 없다.
        // 문자열만 추가해서 DB를 생성하면 됨. (내가 의존해야 할 것은 DBFactory)
        // DB를 추가하고 싶으면 DB 생성 후 dbFactory의 if문에 추가만 하면 됨.
        DB maria = dbFactory.createDB("maria");
        maria.execute("select");

        DB mysql = dbFactory.createDB("mysql");
        mysql.execute("select");


    }
}
