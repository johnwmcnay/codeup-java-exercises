public class EmployeeTest {

    public static void main(String[] args) {

        Employee bob = new Developer("Bob", "Information Technology");
        Employee eric = new Manager("Eric", "Human Resources");

        System.out.println("bob.getName() = " + bob.getName());
        System.out.println("bob.getDepartment() = " + bob.getDepartment());

        System.out.println("eric.getName() = " + eric.getName());
        System.out.println("eric.getDepartment() = " + eric.getDepartment());

    }
}
