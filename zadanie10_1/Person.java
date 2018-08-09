public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private long pesel;

    public Person(String firstName, String lastName, int age, long pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws NameUndefinedException {
        if (firstName.length() <= 2)
            throw new NameUndefinedException();
        else
            this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NameUndefinedException {
        if (lastName.length() <= 2)
            throw new NameUndefinedException();
        else
            this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException{
        if (age < 1)
            throw new IncorrectAgeException();
        else
            this.age = age;
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }
}
