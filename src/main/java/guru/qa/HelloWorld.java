package guru.qa;


public class HelloWorld {
    public static void main(String[] args) {
    Person person1 = new Person();
    person1.setName("");
    person1.setAge(50);
    System.out.println("Выводим значение в main методе: "+person1.getName());
    System.out.println("Выводим значение в main методе: "+person1.getAge());
    Person person2 = new Person();
    person2.setName("Вован");
    person2.setAge(20);
    System.out.println("Выводим значение в main методе: "+person2.getName());
    System.out.println("Выводим значение в main методе: "+person2.getAge());
    }
}
class Person{
    private String name;
    private int age;

    public void setName(String username){
        if(username.isEmpty()){
            System.out.println("Ты ввёл пустое имя");
        } else{
        name = username;}
    }
    public String getName(){
        return name;
    }
    public void setAge(int userage){
        if(userage<0){
            System.out.println("Возраст должен быть положительным");
        } else {
        age = userage;}
    }
    public int getAge(){
        return age;
    }

    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;
    }

    void speak(){
        for(int i = 0; i<3; i++) {
            System.out.println("Меня зовут " + name + ",мне " + age + "лет");
        }
    }
    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }

    void sayHello(){
        System.out.println("Привет");
    }
}
















































