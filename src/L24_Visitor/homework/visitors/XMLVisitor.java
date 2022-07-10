package L24_Visitor.homework.visitors;

import L24_Visitor.homework.entities.Post;
import L24_Visitor.homework.entities.User;

public class XMLVisitor implements Visitor {

    @Override
    public String visit(User user) {
        return ("<user>"
                + "<id>%d</id>"
                + "<name>%s</name>"
                + "<description>%s</description>"
                + "</user>")
                .formatted(user.getId(), user.getName(), user.getDescription());
    }

    @Override
    public String visit(Post post) {
        return ("<post>"
                + "<id>%d</id>"
                + "<title>%s</title>"
                + "<text>%s</text>"
                + "</post>")
                .formatted(post.getId(), post.getTitle(), post.getText());
    }
}
