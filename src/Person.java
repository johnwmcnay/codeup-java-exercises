public class Person {

    private String name;

    public static void main(String[] args) {
        Person john = new Person("John");

//        john.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

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

    public static Person[] addPerson(Person newPerson, Person[] personArray) {
        Person[] newArray = new Person[personArray.length + 1];

        for (byte i = 0; i < personArray.length; i++) {
            newArray[i] = personArray[i];
        }
        newArray[personArray.length] = newPerson;

        return newArray;
    }
}
