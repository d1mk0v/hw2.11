package pro.sky.shopingCart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Ваше задание на сегодня — нужно написать сервис, который собирает корзину для интернет-магазина.
//
//		Разработайте контроллер, сервис и некую сущность корзины с покупками.
//		У контроллера должны быть два метода:
//		/store/order/add
//
//		/store/order/get
//
//		При обращении к методу add можно в качестве параметров запроса передавать один или несколько чисел, которые
//		являются ID некоего товара.
//		При get мы должны получить все добавленные ID в виде списка в JSON-формате.
//		Для каждого подключения нового клиента должен создаваться новый объект — корзина.
//		Никаких хранилищ всех корзин быть не должно.
//		В качестве теста можно зайти со своего браузера и добавить итемы (item), далее — получить список.
//		Этот же тест нужно проделать через браузер в режиме инкогнито и получить другой список.

@SpringBootApplication
public class ShoppingCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartApplication.class, args);
	}

}
