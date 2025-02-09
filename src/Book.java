import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        if (author == null) {
            throw new IllegalArgumentException("\nАвтор обязателен для книги.");
        }
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    // метод преобразования класса в строку
    @Override
    public String toString() {
        return title + "; " + author + "; " + publicationYear;
    }

    @Override
    public boolean equals(Object other) {
        // проверка, что оба объекта ссылаются на один объект
        if (this == other) {
            return true;
        }
        // проверка на разность классов и на null
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        // приведение типа
        Book a = (Book) other;
        return Objects.equals(title, a.title) && Objects.equals(author, a.author)
                && publicationYear == a.publicationYear;
    }
    // генерация хэш-кода на основе полей
    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, author, publicationYear);
    }
}
