import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    // метод преобразования класса в строку
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals (Object other) {
        // проверка, что оба объекта ссылаются на один объект
        if (this == other) {
            return true;
        }
        // проверка на разность классов и на null
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        // приведение типа
        Author a = (Author) other;
        return Objects.equals(firstName, a.firstName) && Objects.equals(lastName, a.lastName);
    }
    // генерация хэш-кода на основе полей
    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName, lastName);
    }
}
