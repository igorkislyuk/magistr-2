package ru.itmotourism;

/**
 * Created by edvanchi on 2/13/2018.
 */
public class DaysCounter {
    public static int getMonthDays(int month, int year) {
        int summ = 0;
        for (int i = 1; i < month; i++) {
            if(i==1 || i==3||i==5 || i==7 || i==8 || i==10 || i==12)summ+=31;
            else if(i==2 && year%4==0) summ+=29;
            else if(i==2)summ+=28;
            else summ+=30;
        }
        summ+=(year-1970)/4;
        if((year)%4!=0)summ-=1;
        return  summ;
    }
}
