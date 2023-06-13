package ch06;

public class Practice18 {
    int iv = 10;
    static int cv = 20;
    int iv2 = cv;
    //static int cv2 = iv; // 라인 A => static으로 정의 된 변수에 인스턴스 변수를 사용할 수 없다.

    static void staticMethod1() {
        System.out.println(cv);
       // System.out.println(iv); // 라인 B => static으로 정의 된 메서드에 인스턴스 변수를 사용할 수 없다.
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);  //라인 C
    }

    static void staticMethod2() {
        staticMethod1();
        //instanceMethod1();  //라인 D => static으로 정의 된 변수에 인스턴스 메서드를 사용할 수 없다.
    }

    void instanceMethod2() {
        staticMethod1();  //라인 E
        instanceMethod1();
    }
}
