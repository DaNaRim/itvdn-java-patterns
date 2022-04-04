package L02_Builder.pizza.builders;

import L02_Builder.pizza.components.*;

public interface Builder {
    void setDough(Dough dough);
    void setSauce(Sauce sauce);
    void setCheese(Cheese... cheese);
    void setMeet(Meat... meat);
    void setVegetables(Vegetables... vegetables);
}
