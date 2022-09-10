public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }
    public static void task1() {
        System.out.println("Задача 1");
        double salary = 29000;
        double sum = 0;
        int i = 0;
        for (; sum<=2_459_000; i++) {
            sum += salary;
            sum += sum*0.01;
        }
        String formatSum = String.format("%.2f", sum);
        System.out.println("Месяц " + i + ", сумма накоплений равна " + formatSum + " рублей");
    }
    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while(i<=10) {
            System.out.print(i+" ");
            i++;
        } i--;
        System.out.println();
        for (;i>0;i--) {
            System.out.print(i+" ");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int population = 12000000;
        double koefficientGrowth = (17.0-8.0)/1000.0;
        double peopleIncrement = 0.0;
        int year = 0;
        for (int i=1; i<=10; i++) {
            peopleIncrement = population * koefficientGrowth;
            population += peopleIncrement;
            year = i;
        } System.out.println("Год " + year + ", численность населения составляет " + population);
    }

    public static void task4() {
        System.out.println("Задача 4");
        double percent = 1.07;
        double money = 15000.0;
        String s;
        for (int i = 1; money<12_000_000; i++) {
            money*=percent;
            s = String.format("%.2f", money);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + s + " рублей");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        double percent = 1.07;
        double money = 15000.0;
        String s;
        for (int i = 1; money<12_000_000; i++) {
            money*=percent;
            if (i%6==0) {
                s = String.format("%.2f", money);
                System.out.println("Месяц " + i + ", сумма накоплений равна " + s + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        double percent = 1.07;
        double money = 15000.0;
        String s;
        for (int i = 1; i<=12*9; i++) {
            money*=percent;
            if (i%6==0) {
                s = String.format("%.2f", money);
                System.out.println("Месяц " + i + ", сумма накоплений равна " + s + " рублей");
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int i=5;
        for (; i<=31; i++) {
            if (i%7 == 5) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
            }
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int a = 1822; int b = 2122;
        for (int i = a; i<=b; i++) {
            if (i%79==0) {
                System.out.println(i);
            }
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        for (int i = 1; i<=10; i++) {
            System.out.println("2*" + i + '=' + 2*i);
        }
    }
}