package Dima.d;

public class PublicationsType {

    public enum PublicationType {
        BOOK("Книга"),
        MAGAZINE("Журнал"),
        NEWSPAPER("Газета");

        private final String label;

        PublicationType(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;

        }

        @Override
        public String toString() {
            return label;
        }
    }
}
