package ch04;

public class Practice04 {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        for(int i=0;sum<100;i++){
            count=i;
            if(i%2==0){
                sum-=i;
            }else{
                sum+=i;
            }
        }
        System.out.println(count);
    }
}
