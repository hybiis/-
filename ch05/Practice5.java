package ch05;

//[5-5] 다음은 1~9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다. 알맞은 코드를 넣어서 프로그램을 완성하시오.

public class Practice5 {
    public static void main(String[] args) {
        int[] ballArr = {1,2,3,4,5,6,7,8,9};
        int[] ball3 = new int[3];
        // ballArr . 배열 의 임의의 요소를 골라서 위치를 바꾼다
        for(int i=0; i< ballArr.length;i++) {
            int j = (int)(Math.random() * ballArr.length);
            int tmp = 0;

        //(1) . 알맞은 코드를 넣어 완성하시오
            tmp=ballArr[i];
            ballArr[i]=ballArr[j];
            ballArr[j]=tmp;
        }

        System.arraycopy(ballArr,0,ball3,0,3);
        /* (2) */
        for(int i=0;i<ball3.length;i++) {
            System.out.print(ball3[i]);
        }
    } // end of main
} // end of class