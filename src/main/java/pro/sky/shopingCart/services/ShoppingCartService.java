package pro.sky.shopingCart.services;

import pro.sky.shopingCart.ShoppingCartItem;

import java.util.List;

public interface ShoppingCartService {
    ShoppingCartItem addItemToCart(int ID);
    List<Integer> getCartItems();
}
