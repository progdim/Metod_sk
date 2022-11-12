package com.company;

import java.time.LocalDate;

//import static sun.security.util.Debug.args;

public class hm_homwork {

    public static void recognizesTheyear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void osType(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Вам требуется установить облегченную версию");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке:");
            }
        }
        if (clientOS == 1) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Вам требуется установить облегченную версию");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке:");
            }
        }
    }


    public static void calculateDeliveryDays  (int kilometr){
            int rezult = 1;
            for (int i =20; i <= kilometr; i+=40 ){
                rezult++;
            }
        System.out.println(rezult);
    }





        public static void main (String[]args){
            recognizesTheyear(1896);
            osType(1,2020);
            calculateDeliveryDays(100);



    }
}
