package Dima.d;

import java.util.Objects;

public class Book extends Publication implements Printable {

    public String ISBN;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Book(String title, String author, int year, String ISBN) {
        super(title, author, year);
        this.ISBN = ISBN;
    }

    @Override
    public String getType() {
        return PublicationsType.PublicationType.BOOK.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return Objects.equals(ISBN, book.ISBN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ISBN);
    }

    @Override
    public void printDetails() {
        System.out.println(this.toString());

    }

    @Override
    public String toString() {
        return super.toString() + "ISBN: " + ISBN;
    }
}
