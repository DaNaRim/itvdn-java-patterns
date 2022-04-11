package L06_Singleton.homework;

import java.util.ArrayList;

public enum BookShelf {

    INSTANCE;

    ArrayList<Book> books = new ArrayList<>();

    BookShelf() {
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
