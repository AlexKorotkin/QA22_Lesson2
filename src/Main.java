//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Иванов Иван", "Инженер", "Ivanov@mail.ru",
                                        "+375297464046", 1000, 30);
        person.personInfo();

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Петров Петр", "Инженер", "Petrov@mail.ru","+375297464047", 1000, 32);
        persArray[1] = new Person("Сидоров Олег", "Инженер", "Sidorov@mail.ru","+375297464048", 1000, 34);
        persArray[2] = new Person("Короткин Александр", "Инженер", "Korotkin@mail.ru","+375297464049", 1000, 38);
        persArray[3] = new Person("Гегелев Степан", "Инженер", "Gegelev@mail.ru","+375297464045", 1000, 35);
        persArray[4] = new Person("Поляков Александр", "Инженер", "Polyakov@mail.ru","+375297464044", 1000, 41);

    }

}