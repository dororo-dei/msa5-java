package org.example.e06oop;

public class AccessModifier {
    // 접근 제어 지시자는 클래스, 필드, 메소드에도 붙일 수 있다

    // 1. default: 같은 패키지에 소속 된 클래스에서만 접근 가능
    // 그냥 접근 제어 지시자 자리에 아무것도 작성안하면 됨
    String strDefault = "Default";

    // 2. public: 클래스 내/외부 어디에서나 접근 가능
    public String strPublic = "public";

    // 3. private: 클래스 내부에서만 접근 가능
    private String strPrivate = "private";

    // 4. protected: 같은 패키지/ 클래스 내부/ 자식 클래스에서 접근 가능
    protected String strProtected = "protected";

    void fnDefault(){
        System.out.println("Default Fn");
    }
    public void fnPublic() {
        System.out.println("Public Fn");
    }
    private void fnPrivate() {
        System.out.println("private Fn");
    }
    protected void fnProtected() {
        System.out.println("Protected Fn");
    }
}
