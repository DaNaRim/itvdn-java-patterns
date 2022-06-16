package L17_Iterator.interator;

public class Catalog {

    static final int MAX_ITEMS = 10;
    int numberOfItems = 0;
    CatalogItem[] catalogItems;

    public MyIterator createIterator() {
        return new CatalogIterator(catalogItems);
    }
}
