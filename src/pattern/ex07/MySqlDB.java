package pattern.ex07;

public class MySqlDB implements DB{
    private String url;

    // 쿼리 실행 메서드
    @Override
    public int execute(String sql){

        if(url == null){
            throw new NullPointerException("db driver not found exception");
        }

        if(sql.equals("select")){
            System.out.println("query execute : " +url+sql);
            return 1;
        } else{
            System.out.println("query fail : syntax error");
            return -1;
        }
    }

    // URL 세팅 메서드
    @Override
    public void setUrl(String url){
        this.url = url;
    }
}
