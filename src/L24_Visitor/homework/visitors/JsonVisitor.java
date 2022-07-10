package L24_Visitor.homework.visitors;

import L24_Visitor.homework.entities.Post;
import L24_Visitor.homework.entities.User;

public class JsonVisitor implements Visitor {

    @Override
    public String visit(User user) {
        return ("{ "
                + "\"id\": \"%d\", "
                + "\"name\": \"%s\", "
                + "\"description\": \"%s\" "
                + "}")
                .formatted(user.getId(), user.getName(), user.getDescription());
    }

    @Override
    public String visit(Post post) {
        return ("{ "
                + "\"id\": \"%d\", "
                + "\"title\": \"%s\", "
                + "\"text\": \"%s\" "
                + "}")
                .formatted(post.getId(), post.getTitle(), post.getText());
    }
}
