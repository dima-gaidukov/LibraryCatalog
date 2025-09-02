package Dima.d;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    private static final Library library = new Library();

    private static final List<Publication> publications = new ArrayList<>();


    public static void main(String[] args) {

        showMainMenu();

    }

    private static void showMainMenu() {

        boolean quit = false;

        while(!quit) {
            System.out.println("Добро пожаловать в меню!" + "\n");
            System.out.println("Опция 1: Добавить новую публикацию.");
            System.out.println("Опция 2: Вывести список всех публикаций. ");
            System.out.println("Опция 3: Поиск публикации по автору. ");
            System.out.println("Опция 4: Вывести общее количество публикаций (используя статический метод). ");
            System.out.println("Опция 0: Выход. ");

            int choice = getIntInput();

            switch (choice) {
                case 1 -> {
                    System.out.println("Выберите тип публикации: 1 \uE089 Book, 2 \uE089 Magazine, 3 \uE089 Newspaper");

                    int put = getIntInput2();
                    Publication publication = null;

                    switch (put) {
                        case 1 -> {
                            scanner.nextLine();
                            System.out.println("Вы выбрали тип публикации Книга!!! ");
                            System.out.println("Введите название: ");

                            String title = scanner.nextLine().trim().toLowerCase();

                            System.out.println("Введите автора: ");

                            String author = scanner.nextLine().trim().toLowerCase();

                            System.out.println("Введите год: ");

                            int year = Integer.parseInt(scanner.nextLine().trim());

                            System.out.println("Введите ISBN: ");

                            String ISBN = scanner.nextLine().trim().toLowerCase();


                            publication = new Book(title, author, year, ISBN);
                        }
                        case 2 -> {
                            scanner.nextLine();
                            System.out.println("Вы выбрали тип публикации Журнал!!! ");
                            System.out.println("Введите название: ");

                            String title = scanner.nextLine().trim().toLowerCase();

                            System.out.println("Введите автора: ");

                            String author = scanner.nextLine().trim().toLowerCase();

                            System.out.println("Введите год: ");

                            int year = scanner.nextInt();

                            System.out.println("Введите issueNumber: ");

                            int issueNumber = scanner.nextInt();

                            publication = new Magazine(title, author, year, issueNumber);
                        }
                        case 3 -> {
                            scanner.nextLine();
                            System.out.println("Вы выбрали тип публикации Газета!!! ");
                            System.out.println("Введите название: ");

                            String title = scanner.nextLine().trim().toLowerCase();

                            System.out.println("Введите автора: ");

                            String author = scanner.nextLine().trim().toLowerCase();

                            System.out.println("Введите год: ");

                            int year = Integer.parseInt(scanner.nextLine().trim());

                            System.out.println("Введите publicationDay: ");

                            String publicationDay = scanner.nextLine().trim().toLowerCase();

                            publication = new Newspaper(title, author, year, publicationDay);
                        }
                        default -> System.out.println("Неверный выбор! Попробуйте снова. ");
                    }
                    if (publication != null) {
                        library.addPublication(publication);
                        System.out.println("Публикация добавлена");
                    }

                }
                case 2 -> library.listPublications();
                case 3 -> {
                    System.out.println("Введите имя Автора:  ");
                    scanner.nextLine();
                    String author = scanner.nextLine().trim().toLowerCase();
                    library.searchPublication(author);
                }
                case 4 -> System.out.println("Общее количество публикаций : " + Publication.getPublicationCount());
                case 0 -> {
                    quit = true;
                    System.out.println("Всего хОрОшЕгО!!! ");

                }
                default -> System.out.println("Неверный выбор! Попробуйте снова. ");

            }


        }scanner.close();


    }

    private static int getIntInput() {

        int input;

        do {

            System.out.println("Введите чило: от 0 - 4 ");

            while (!scanner.hasNextInt()) {
                System.out.println("Нужно вести цифру! Введите чило: от 0 - 4 ");
                scanner.next();
            }
            input = scanner.nextInt();
            if (input < 0 || input > 4) {
                System.out.println("Попробуйте еще раз!!!");
            }
        }
        while (input < 0 || input > 4);
        return input;

    }

    private static int getIntInput2() {

        int input2;

        do {

            System.out.println("Введите чило: от 1 - 3 ");

            while (!scanner.hasNextInt()) {
                System.out.println("Нужно вести цифру! Введите чило: от 1 - 3 ");
                scanner.next();

            }
            input2 = scanner.nextInt();
            if (input2 < 1 || input2 > 3) {
                System.out.println("Попробуйте еще раз!!!");
            }
        }
        while (input2 < 1 || input2 > 3);
        return input2;

    }

}
