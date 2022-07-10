package L24_Visitor.homework.visitors;

import L24_Visitor.homework.entities.Post;
import L24_Visitor.homework.entities.User;

public interface Visitor {

    String visit(User user);

    String visit(Post post);
}
