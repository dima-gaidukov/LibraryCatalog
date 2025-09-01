package Dima.d;
import java.util.ArrayList;
import java.util.List;

public class Library {



    private int publicationCount = 1;
    private List<Publication> publications;

    public Library() {
        this.publications = new ArrayList<>();

    }

    public void addPublication(Publication pub) {

        publications.add(pub);
        Publication.setPublicationCount(publicationCount++);

    }

    public void listPublications() {

        if(publications == null) {
            System.out.println("Cписок пуст");
            return;
        }

        for (Publication pub : publications) {
            System.out.println(pub.toString());
        }
    }

    public void searchPublication(String author) {

        boolean found = false;

        for (Publication pub : publications) {
            if (pub.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(pub);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Автор не найден!!!");
        }




    }
    public void setPublications(List<Publication> publications) {
        this.publications = publications;
    }

}
