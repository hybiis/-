package ch06;

public class Practice24 {

    public static Integer abs(int value){

        return Math.abs(value);
    }
    public static void main(String[] args)
    {
        int value = 5;
        System.out.println(value+"의 절대값:"+abs(value));
        value = -10;
        System.out.println(value+"의 절대값:"+abs(value));
    }
}
