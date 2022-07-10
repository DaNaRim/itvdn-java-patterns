package L24_Visitor.homework.entities;

import L24_Visitor.homework.visitors.Visitor;

public class User implements Visitable {

    private long id;
    private String name;
    private String description;

    public User(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
