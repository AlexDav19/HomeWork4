public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1(){
        System.out.println("Задание 1");
        int age = 19;
        if(age >=18){
            System.out.printf("Поздравляем, Вам %d лет. Вы совершеннолетны%n", age);
        }else System.out.println("Возраст совершеннолетия еще не наступил и нужно немного подождать ;(");
    }

    public static void task2(){
        System.out.println("Задание 2");
        double temperature = 36.6;
        if(temperature <5)
            System.out.printf("На улице %.0f градусов. Холодно, нужно надеть шапку%n", temperature);
        else if (temperature >5)
            System.out.printf("На улице %.0f градусов. Сегодня тепло, можно идти без шапки%n", temperature);
        else System.out.println("На улице 5 градусов. Сам думай, надевать шапку или нет");
        //в ТЗ нет пометки про ровно 5 градусов
    }
    public static void task3(){
        System.out.println("Задание 3");
        int speed = 43;
        if(speed >60)
            System.out.printf("Скорость %d, придется заплатить штраф%n", speed);
        else if (speed <60)
            System.out.printf("Скорость %d, можно ездить спокойно%n", speed);
        else System.out.println("Скорость 60, еще чуть-чуть и штраф");
        //в ТЗ нет пометки про скорость ровно 60
    }
    public static void task4(){
        System.out.println("Задание 4");
        int age = 28;
        if(age >=2 && age <=6)
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в детский сад.%n", age);
        else if (age >=7 && age <=18)
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в школу.%n", age);
        else if (age >18 && age <24)
            System.out.printf("Если возраст человека равен %d, то его место в университете.%n", age);
        else if (age >=24)
            System.out.printf("Если возраст человека равен %d, то ему пора ходить на работу.%n", age);
        else System.out.println("Отдыхай");
    }
    public static void task5(){
        System.out.println("Задание 5");
        int age = 13;
        if(age <5)
            System.out.printf("Если возраст ребенка равен %d, то он не может кататься на аттракционе.%n", age);
        else if (age >=5 && age <=14)
            System.out.printf("Если возраст ребенка равен %d, то он может кататься только в сопровождении взрослого." +
                    " Если взрослого нет, то кататься нельзя.%n", age);
        else
            System.out.printf("Если возраст ребенка равен %d, то он может кататься без сопровождения взрослого.%n", age);
    }
    public static void task6(){
        System.out.println("Задание 6");
        int place = 103;
        int seat = 60;
        int people = 77;
        if( seat > people)
            System.out.printf("В вагане свободно %d сидячих мест%n", seat-people );
        else if (place > people)
            System.out.printf("В вагане свободно %d стоячих мест%n", place-people );
        else
            System.out.println("В вагоне нет свободных мест");
    }
    public static void task7(){
        System.out.println("Задание 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if( one > two && one > three)
            System.out.println("Наибольшее число = " + one );
        else if (two > three && two > one)
            System.out.println("Наибольшее число = " + two );
        else
            System.out.println("Наибольшее число = " + three );
    }
}