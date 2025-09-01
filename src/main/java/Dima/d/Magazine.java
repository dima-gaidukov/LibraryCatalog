package Dima.d;

import java.util.Objects;

public class Magazine extends Publication implements Printable {

    public int issueNumber;

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public Magazine(String title, String author, int year, int issueNumber) {
        super(title, author, year);
        this.issueNumber = issueNumber;

    }


    @Override
    public void printDetails() {
        System.out.println(toString());

    }

    @Override
    public String getType() {
        return PublicationsType.PublicationType.MAGAZINE.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Magazine magazine = (Magazine) o;
        return issueNumber == magazine.issueNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), issueNumber);
    }

    @Override
    public String toString() {
        return super.toString() + "issueNumber=" + issueNumber;
    }
}
