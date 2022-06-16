package L17_Iterator.interator;

public class CatalogItem {

    private String name;

    public CatalogItem(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Catalog item with name='" + name + '\'';
    }
}
