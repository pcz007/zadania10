import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Person person = new Person(null, null, 0, 0);
        Scanner scan = new Scanner(System.in);

        while (person.getFirstName() == null) {
            try {
                System.out.println("Podaj imię: ");
                person.setFirstName(scan.nextLine());
            } catch (NameUndefinedException ex) {
                System.out.println("Podano za krótkie imię!");
            }
        }

        while (person.getLastName() == null) {
            try {
                System.out.println("Podaj nazwisko: ");
                person.setLastName(scan.nextLine());
            } catch (NameUndefinedException ex) {
                System.out.println("Podano za krótkie nazwisko!");
            }
        }

        while (person.getAge() == 0) {
            try {
                System.out.println("Podaj wiek: ");
                person.setAge(scan.nextInt());
            } catch (IncorrectAgeException ex) {
                System.out.println("Minimalny wiek to 1");
            }
        }
        System.out.println("Podaj pesel: ");
        person.setPesel(scan.nextLong());

    }
}
