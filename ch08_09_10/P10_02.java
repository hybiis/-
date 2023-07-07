package ch08_09_10;

import java.util.*;
import java.text.*;

public class P10_02 {
    static int paycheckCount(Calendar from, Calendar to) {
        int monDiff;
        int fMonth = from.get(Calendar.MONTH);
        int tMonth = to.get(Calendar.MONTH);
        int fDay = from.get(Calendar.DAY_OF_MONTH);
        int tDay = to.get(Calendar.DAY_OF_MONTH);

        if(from == null || to == null) return 0;
        if(from.compareTo(to)==0  && fDay == 21) return 1;

        monDiff = tMonth - fMonth;

        if(monDiff < 0) return 0;
        if(fDay <= 21 || tDay >= 21) monDiff++;
        if(fDay >= 21 || tDay <= 21) monDiff--;

        return monDiff;
    }

    static void printResult(Calendar from, Calendar to) {

        Date fromDate = from.getTime();
        Date toDate = to.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.print(sdf.format(fromDate) + "~" + sdf.format(toDate) + ":");
        System.out.println(paycheckCount(from, to));

    }

    public static void main(String[] args) {

        Calendar fromCal = Calendar.getInstance();
        Calendar toCal = Calendar.getInstance();

        fromCal.set(2010, 0, 1);
        toCal.set(2010, 0, 1);

        printResult(fromCal, toCal);

        fromCal.set(2010, 0, 21);
        toCal.set(2010, 0, 21);

        printResult(fromCal, toCal);

        fromCal.set(2010, 0, 1);
        toCal.set(2010, 2, 1);

        printResult(fromCal, toCal);

        fromCal.set(2010, 0, 1);
        toCal.set(2010, 2, 23);

        printResult(fromCal, toCal);

        fromCal.set(2010, 0, 23);
        toCal.set(2010, 2, 21);

        printResult(fromCal, toCal);

        fromCal.set(2011, 0, 22);
        toCal.set(2010, 2, 21);

        printResult(fromCal, toCal);

    }
}
