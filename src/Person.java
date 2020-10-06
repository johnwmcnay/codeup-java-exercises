public class Person {

    private String name;

    public static void main(String[] args) {
        Person john = new Person("John");

        john.sayHello();

    }

    public Person(String name) {
        this.setName(name);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.printf("Hello, %s\n!", this.getName());
    }
}
