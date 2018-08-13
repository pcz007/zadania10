public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private long pesel;

    public Person(String firstName, String lastName, int age, long pesel) throws NameUndefinedException {
        setFirstName(firstName);
        setLastName(lastName);
        this.age = age;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws NameUndefinedException {
        if (firstName.length() <= 2)
            throw new NameUndefinedException("Imię jest za krótkie!");
        else
            this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NameUndefinedException {
        if (lastName.length() <= 2)
            throw new NameUndefinedException("Nazwisko jest za krótkie!");
        else
            this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException {
        if (age < 1)
            throw new IncorrectAgeException("Podano nieprawidłowy wiek!");
        else
            this.age = age;
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    public String toString() {
        return "Imię: " + firstName + " Nazwisko: " + lastName + " Wiek: " + age + " Pesel: " + pesel;
    }
}
