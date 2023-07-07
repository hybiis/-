package ch08_09_10;

public class P9_10 {

    public static String format(String str, int length, int alignment) {

        char[] arr;

        if (length < str.length()) {

            return str.substring(0, length);

        } else {
            arr = new char[length];

            for (int i = 0; i < length; i++) {
                arr[i] = ' ';
            }
        }

        System.out.println(arr);

        if (alignment == 0) {
            System.arraycopy(str.toCharArray(), 0, arr, 0, str.length());
            System.out.println(arr);

        } else if (alignment == 1) {
            int start = (length - str.length()) / 2;

            System.arraycopy(str.toCharArray(), 0, arr, start, str.length());

        } else {
            int start = length - str.length();

            System.arraycopy(str.toCharArray(), 0, arr, start, str.length());

        }

        String ret = "";

        for (int i = 0; i < length; i++) {
            ret += arr[i];
        }

        return new String(ret);
    }

    public static void main(String[] args) {

        String str = "가나다";

        System.out.println(format(str, 7, 0)); // 왼쪽 정렬

        System.out.println(format(str, 7, 1)); // 가운데 정렬

        System.out.println(format(str, 7, 2)); // 오른쪽 정렬

    }
}
