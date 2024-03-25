package pattern.ex04;

// 예전에 만들어진 레거시 코드 or 외부에서 만든 라이브러리
// OuterTiger 코드를 수정하면 OCP 원칙 위반
public class OuterTiger {
    private String fullName = "호랑이";

    public String getFullName() {
        return fullName;
    }
}