package pro.sky.shopingCart.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;
import pro.sky.shopingCart.ShoppingCartItem;

import java.util.HashSet;
import java.util.Set;

@Service
@RequestScope
public abstract class ShoppingCartServiceImpl implements ShoppingCartService {

    private Set<ShoppingCartItem> items = new HashSet<>();

    public ShoppingCartItem addItemToCart(int ID) {
        ShoppingCartItem item = new ShoppingCartItem(ID);
        items.add(item);
        return item;
    }

    public ShoppingCartItem getCartItems() {
        return null;
    }
}
