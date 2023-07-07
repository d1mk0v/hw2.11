package pro.sky.shopingCart.services;

import pro.sky.shopingCart.ShoppingCartItem;

public interface ShoppingCartService {
    ShoppingCartItem addItemToCart(int ID);
    ShoppingCartItem getCartItems();
}
