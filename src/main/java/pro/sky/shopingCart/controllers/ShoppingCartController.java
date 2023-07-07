package pro.sky.shopingCart.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.shopingCart.ShoppingCartItem;
import pro.sky.shopingCart.services.ShoppingCartService;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping(path = "/add")
    public ShoppingCartItem addItemToCart (@RequestParam("ID") int ID) {
        return shoppingCartService.addItemToCart(ID);
    }

    @GetMapping(path = "/get")
    public List<Integer> getCartItems() {
        return shoppingCartService.getCartItems();
    }


}
