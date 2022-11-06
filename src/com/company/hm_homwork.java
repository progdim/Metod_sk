package com.company;

import java.time.LocalDate;

//import static sun.security.util.Debug.args;

public class hm_homwork {

    public static void recognizesTheyear(int year) {
        if (year % 4 == 0) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " - не високосный год");
            ;
        }
    }

    public static void osType(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear > currentYear) {
                System.out.println("Вам требуется установить облегченную версию");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке:");
            }
        }
        if (clientOS == 1) {
            if (clientDeviceYear > currentYear) {
                System.out.println("Вам требуется установить облегченную версию");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке:");
            }
        }
    }


    public static int raschetDostavki(int distance) {
        int day = 0;
        if (distance <= 20) {
            day++;
        } else if (20 < distance > 60){
//            day = day+2;
//            System.out.println(day);
//        }else if (60 >= distance & distance <= 100){
//            day= day+3;
//            System.out.println(day);
//        }
//        //System.out.println(day);
    //        return day;
        }
        return day;
    }








        public static void main(String[]args){
            recognizesTheyear(1896);
            osType(1,2020);
            raschetDostavki(15);


    }
}
