public class Person {
    String fullName;
    String position;
    String email;
    String tel;
    int salary;
    int age;

    public Person(String fullName, String position, String email, String tel, int salary, int age){
       this.fullName = fullName;
       this.position = position;
       this.email = email;
       this.tel = tel;
       this.salary = salary;
       this.age = age;
    }
     public void personInfo(){
         System.out.println("ФИО: " + this.fullName + "\nДолжность: " + this.position + "\nТелефон: " + this.tel + "\nЗарплата: " +
                 this.salary + "\nВозраст: " + this.age);
    }
}
