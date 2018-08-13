import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String firstName = scan.nextLine();

        System.out.println("Podaj nazwisko: ");
        String lastName = scan.nextLine();

        System.out.println("Podaj wiek: ");
        int age = scan.nextInt();

        System.out.println("Podaj pesel: ");
        long pesel = scan.nextLong();

        try {
            Person person1 = new Person(firstName, lastName, age, pesel);
            person1.setFirstName(firstName);
            person1.setLastName(lastName);
            person1.setAge(age);
            person1.setPesel(pesel);
            System.out.println("Dodano osobę: " + person1.toString());
        } catch (NameUndefinedException | IncorrectAgeException ex) {
            System.err.println("Błąd!");
            System.err.println(ex.getMessage());
        }
        scan.close();
    }
}
