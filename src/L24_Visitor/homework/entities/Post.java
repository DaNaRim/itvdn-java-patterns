package L24_Visitor.homework.entities;

import L24_Visitor.homework.visitors.Visitor;

public class Post implements Visitable {

    private long id;
    private String title;
    private String text;

    public Post(long id, String title, String text) {
        this.id = id;
        this.title = title;
        this.text = text;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
