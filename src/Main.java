import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        //Задача 1+2
        int clientOS = ThreadLocalRandom.current().nextInt(2);
        int min = 2007;
        int max = 2022;
        int diff = max-min;
        Random random = new Random();
        int clientDeviceYear=random.nextInt(diff+1)+min;
        boolean deviceIsOld=clientDeviceYear<2015;
        if(clientOS==0){
            if (deviceIsOld){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке\n");
            }else{
            System.out.println("Установите версию приложения для iOS по ссылке\n");}
        } else {
            if(deviceIsOld){
                System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
            }else{
            System.out.println("Установите версию приложения для Android по ссылке\n");}
        }

        //Задача 3
        int year = ThreadLocalRandom.current().nextInt(2023);
        if(year%4==0){
            if(year%400!=0 && year%100==0){
                System.out.println(year+" год не является високосным\n");
            }else{
                System.out.println(year+" год является високосным\n");
            }
        }else{
            System.out.println(year+" год не является високосным\n");
        }

        //Задача 4

        int deliveryDistance = 95;
        int firstDayDistance = 20;
        int additionalDistance = 40;
        int days = 0;
        if((deliveryDistance-firstDayDistance)%additionalDistance==0){
            days = 1+(deliveryDistance-firstDayDistance)/additionalDistance;
            System.out.println(days+"\n");
        }else{
            days = 2+(deliveryDistance-firstDayDistance)/additionalDistance;
            System.out.println(days+"\n");
        }

        //Задача 5

        int monthNumber = 10;
        if(monthNumber>=1 && monthNumber<=12){
            switch (monthNumber) {
                case 1:
                    System.out.println("Jan\n");
                    break;
                case 2:
                    System.out.println("Feb\n");
                    break;
                case 3:
                    System.out.println("March\n");
                    break;
                case 4:
                    System.out.println("Apr\n");
                    break;
                case 5:
                    System.out.println("May\n");
                    break;
                case 6:
                    System.out.println("Jun\n");
                    break;
                case 7:
                    System.out.println("Jul\n");
                    break;
                case 8:
                    System.out.println("Aug\n");
                    break;
                case 9:
                    System.out.println("Sept\n");
                    break;
                case 10:
                    System.out.println("Oct\n");
                    break;
                case 11:
                    System.out.println("Nov\n");
                    break;
                case 12:
                    System.out.println("Dec\n");
            }
        }else{
            System.out.println("Unknown entry\n");
        }

    }
}