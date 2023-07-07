package ch08_09_10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class P10_05 {

    public static int getDayDiff(String yyyymmdd1, String yyyymmdd2){
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

        int ret = 0;

        try {
            Date date1 = format.parse(yyyymmdd1);
            Date date2 = format.parse(yyyymmdd2);

            long diff = (date1.getTime() - date2.getTime()) / (24*60*60*1000);
            ret = (int)Math.abs(diff);
        } catch (ParseException e) {
            //e.printStackTrace();

        }
        return ret;
    }

    public static void main(String[]args){

        System.out.println(getDayDiff("20010103","20010101"));
        System.out.println(getDayDiff("20010103","20010103"));
        System.out.println(getDayDiff("20010103","200103"));

    }
}
