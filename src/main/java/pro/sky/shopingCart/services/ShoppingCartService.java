package pro.sky.shopingCart.services;

import pro.sky.shopingCart.ShoppingCartItem;

import java.util.List;
import java.util.Set;

public interface ShoppingCartService {
    ShoppingCartItem addItemToCart(int ID);
    Set<ShoppingCartItem> getCartItems();
}
