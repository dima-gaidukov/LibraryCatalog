package Dima.d;

import java.util.Objects;

public abstract class Publication implements Printable {

    private String title;

    private String author;

    private int year;

    public Publication(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;

    }

    public abstract String getType();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Publication that = (Publication) o;
        return Objects.equals(title, that.title) && Objects.equals(author, that.author) && Objects.equals(year, that.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }

    @Override
    public String toString() {
        return getType() + "- " + "Название: " + getTitle() + " " + "Автор: " + getAuthor() + " " + "Год: " + getYear() + " ";
    }

    private static int publicationCount = 0;

    public static int getPublicationCount() {
        return publicationCount;

    }

    public static void setPublicationCount(int publicationCount) {
        Publication.publicationCount = publicationCount;


    }



    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
