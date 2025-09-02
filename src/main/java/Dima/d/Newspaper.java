package Dima.d;

import java.util.Objects;

public class Newspaper extends Publication implements Printable {

    public String publicationDay;

    public String getPublicationDay() {
        return publicationDay;
    }

    public void setPublicationDay(String publicationDay) {
        this.publicationDay = publicationDay;
    }

    public Newspaper(String title, String author, int year,String publicationDay) {
        super(title, author, year);
        this.publicationDay = publicationDay;
    }


    @Override
    public void printDetails() {
        System.out.println(this.toString());

    }

    @Override
    public String getType() {
        return PublicationsType.PublicationType.NEWSPAPER.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Newspaper newspaper = (Newspaper) o;
        return Objects.equals(publicationDay, newspaper.publicationDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), publicationDay);
    }

    @Override
    public String toString() {
        return super.toString() + "publicationDay: " + publicationDay ;
    }
}
