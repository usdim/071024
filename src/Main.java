//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void Reading (Readeble a ){
        a.read();
    }
    public static void main(String[] args) {


        Book book1 = new Book();
        System.out.println(book1.TEXTCOLOR); // выводим константу на печать
        book1.print();
        Journal journal1 = new Journal();
        journal1.print();

        Prinatable book2 = new Book(); // здесь создали интерфейс
        book2.print();

        Student student1 = new Student();
        System.out.println(student1.SPEEDREADING);
        Student student2 = new Student();
        System.out.println(student2.TMIESLEEP);
        student1.read();
        student2.sleep();
        student1.prn();

        Sleelaple student3 = new Student(); // студент типа интерфейса Sleepable
        Readeble student4 = new Student();

        student3.sleep();
        student4.read();


    }
}



interface Prinatable {

    String TEXTCOLOR = "Black";// Константа пишется ЗАГЛАВНЫМИ БУКВАМИ. Конст присва обязательно

    // значение.
    void print();

}

class Book implements Prinatable {

    @Override
    public void print() {
        System.out.println("идет принт бук ");
    }
}

class Journal implements Prinatable {

    @Override
    public void print() {
        System.out.println("идет принт журнал");
    }
}


class Student implements Readeble, Sleelaple {


    String name;
    int age;
    String faculty;

    public void Student (String name, int age, String faculty) {
        this.name = name;
        this.age = age;
        this.faculty = faculty;

    }

    @Override
    public void read() {
        System.out.println("Стундент 1 читает про джаву ");
    }

    @Override
    public void sleep() {
        System.out.println("Студенет 2 спит за партой ");
    }

    public static void prn (){
        System.out.println("Стундент 1 читает про джаву ");
        System.out.println( SPEEDREADING);
    }

}

interface Readeble {
    void read();

    String SPEEDREADING = " 100 з/ мин";

}

interface Sleelaple {
    void sleep();

    String TMIESLEEP = " 1 час  ";

}
