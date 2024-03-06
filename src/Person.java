public class Person {

    final private String name;
    final private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Introduce(){
        int actualYear = 2024;
        System.out.println("Hi " + name + " your age is " + age + " and you born in the year " + (actualYear - age));
    }
}
