package L24_Visitor.homework;

import L24_Visitor.homework.entities.Post;
import L24_Visitor.homework.entities.User;
import L24_Visitor.homework.visitors.JsonVisitor;
import L24_Visitor.homework.visitors.XMLVisitor;

public class Main {

    public static void main(String[] args) {
        User user = new User(1, "Pavlo", "Strong boy");
        Post post = new Post(1, "Mega Tea in local restaurant", "asiashdfiasgdf");

        JsonVisitor jsonVisitor = new JsonVisitor();
        XMLVisitor xmlVisitor = new XMLVisitor();

        System.out.println(jsonVisitor.visit(user));
        System.out.println(jsonVisitor.visit(post));
        System.out.println();
        System.out.println(xmlVisitor.visit(user));
        System.out.println(xmlVisitor.visit(post));
    }
}
