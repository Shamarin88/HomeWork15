import transport.Car;
import java.time.LocalDate;
public class Main {
    public static void printSeparator() {
        System.out.println("========================");
    }
    public static void main(String[] args) {
        homeWork14Part1();
        homeWork14Part2();
        homeWork15();
    }
    public static void homeWork14Part1() {

        System.out.println("Домашнее задание 1, Задание 1");
        System.out.println();

        Human human1 = new Human(0,"Максим","","Менеджер");
        Human human2 = new Human(0,"Аня","","Методист образовательных программ");
        Human human3 = new Human(0,"Катя","","Продакт-менеджер");
        Human human4 = new Human(0,"Артем","","Директор по развитию бизнеса");
        Human human5 = new Human(0,"Николай","","");

        human1.setTown("Санкт-Петербург");
        human1.setYearOfBirth(1988);

        human2.setTown("Москва");
        human2.setYearOfBirth(1993);

        human3.setTown("Калининград");
        human3.setYearOfBirth(1992);

        human4.setTown("Москва");
        human4.setYearOfBirth(1995);

        human5.setTown(human5.getTown());
        human5.setYearOfBirth(LocalDate.now().getYear() - 21);

        System.out.println(human1);
        printSeparator();
        System.out.println(human2);
        printSeparator();
        System.out.println(human3);
        printSeparator();
        System.out.println(human4);
        printSeparator();
        System.out.println(human5);
        printSeparator();
        System.out.println();
        /*
        Задание 2
        Добавьте в поле класса «Человек» новое свойство — «Должность» (jobTitle).

        Каждому созданному объекту допишите в поле string  должность:

        Максим работает бренд-менеджером.
        Аня работает методистом образовательных программ.
        Катя работает продакт-менеджером.
        Артем работает директором по развитию бизнеса.
        Допишите программу таким образом, чтобы в консоль выводилось приветственное сообщение в формате:
        "Привет! Меня зовут… Я из города… Я родился в… году. Я работаю на должности… . Будем знакомы!"

        Критерии оценки
        Создан класс human со свойствами yearOfBirth, name, town и job.
        Создан объект «Максим» со свойствами класса human.
        Создан объекта «Аня» со свойствами класса human.
        Создан объект «Катя» со свойствами класса human.
        Создан объект «Артем» со свойствами класса human.
        В консоль для каждого объекта выводится сообщение: "Привет! Меня зовут… Я из города… Я родился
        в … году. Я работаю на должности… . Будем знакомы!"
        Переменные инициализированы согласно правилам camelCase.
        */
        System.out.println("Домашнее задание 1, Задание 2");

        System.out.println(human1);
        printSeparator();
        System.out.println(human2);
        printSeparator();
        System.out.println(human3);
        printSeparator();
        System.out.println(human4);
        printSeparator();
        System.out.println();
    }
    public static void homeWork14Part2() {

        System.out.println("Домашнее задание 1 Задание 3");
        System.out.println();

        Car car1 = new Car("Lada", "Granta",1.7,"Желтый",2015,"Россия","Механическая","Седан","а123бв178",5,"летние");
        Car car2 = new Car("Audi","A8 50 L TDI quattro",3.0,"Черный",2020,"Германия","Автоматическая","Cедан","б234гд178",5,"летние");
        Car car3 = new Car("BMW","Z8",3.0,"Черный",2020,"Германия","Автоматическая","Хотрод","в345ее178",2,"летние");
        Car car4 = new Car("Kia","Sportage 4-го поколения",2.4,"Красный",2018,"Южная Корея","Автоматическая","Кроссовер","г456жз178",7,"летние");
        Car car5 = new Car("Hyundai","Avante",1.6,"Оранжевый",2016,"Южная Корея","Механическая","Седан","д567кл178",5,"летние");
        Car.Key = new Car.Key("Без удаленного запуска", "Без удаленного доступа");
        Car.insurance = new Car.insurance(LocalDate.now(),0,"");

        Car.insurance.setInsuranceDuration(LocalDate.now());
        Car.insurance.setInsuranceNumber("123456789");
        Car.insurance.setInsuranceCoast(0);

        System.out.println(car1);
        printSeparator();
        System.out.println(car2);
        printSeparator();
        System.out.println(car3);
        printSeparator();
        System.out.println(car4);
        printSeparator();
        System.out.println(car5);
        printSeparator();
    }
    public static void homeWork15() {

        Flower roseFromHolland = new Flower("","",0,3);
        Flower chrysanthemum = new Flower("","",15,5);
        Flower peonyFromEngland = new Flower("","Англия",69.9,1);
        Flower gypsophila = new Flower("","Турция",19.5,10);

        roseFromHolland.setFlowerColor("");
        roseFromHolland.setCountry("Голландия");
        roseFromHolland.setCost(35.59);

        chrysanthemum.setFlowerColor("");
        chrysanthemum.setCountry("");
        chrysanthemum.setCost(15);

        peonyFromEngland.setFlowerColor("");
        peonyFromEngland.setCountry("Англия");
        peonyFromEngland.setCost(69.9);

        gypsophila.setFlowerColor("");
        gypsophila.setCountry("Турция");
        gypsophila.setCost(19.5);

        printSeparator();
        System.out.println(roseFromHolland);
        printSeparator();
        System.out.println(chrysanthemum);
        printSeparator();
        System.out.println(peonyFromEngland);
        printSeparator();
        System.out.println(gypsophila);
        printSeparator();
    }
}