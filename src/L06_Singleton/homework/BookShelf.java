package L06_Singleton.homework;

import java.util.ArrayList;

public enum BookShelf {

    /*
    Problems with enum as singleton
    1. By default, enums do not support lazy loading.
    2. Can`t convert your singleton to multi-ton, enum would not allow this.
     */

    INSTANCE;

    public final ArrayList<Book> books = new ArrayList<>();

    BookShelf() {
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
