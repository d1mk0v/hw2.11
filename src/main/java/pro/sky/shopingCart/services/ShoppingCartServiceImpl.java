package pro.sky.shopingCart.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;
import pro.sky.shopingCart.ShoppingCartItem;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequestScope
public abstract class ShoppingCartServiceImpl implements ShoppingCartService {

    private Set<ShoppingCartItem> items = new HashSet<>();

    public ShoppingCartItem addItemToCart(int ID) {
        ShoppingCartItem item = new ShoppingCartItem(ID);
        items.add(item);
        return item;
    }

    public List<Integer> getCartItems() {
        return items.stream()
                .map(ShoppingCartItem::getID)
                .collect(Collectors.toList());
    }
}
