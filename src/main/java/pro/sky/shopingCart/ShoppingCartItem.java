package pro.sky.shopingCart;

import java.util.Objects;

public class ShoppingCartItem {
    private int ID;
//    private String name;

    public ShoppingCartItem(int ID) {
        this.ID = ID;
//        this.name = name;
    }

    public int getID() {
        return ID;
    }

//    public String getName() {
//        return name;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShoppingCartItem that)) return false;
        return getID() == that.getID();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getID());
    }
}
