package EsercizioG4Set5BE.yurilenzi.runners;

import EsercizioG4Set5BE.yurilenzi.entities.Pizza;
import EsercizioG4Set5BE.yurilenzi.entities.Toppings;
import EsercizioG4Set5BE.yurilenzi.services.PizzaServices;
import EsercizioG4Set5BE.yurilenzi.services.ToppingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PizzaRunner implements CommandLineRunner {

    @Autowired
    PizzaServices pizzaServices;
    @Autowired
    ToppingServices toppingServices;

    @Autowired
    @Qualifier("cheese")
    Toppings cheese;

//    @Autowired
//    @Qualifier("pizzaMarg")
//    private Pizza pizzaMargherita;
//
//    @Autowired
//    @Qualifier("hawaiian")
//    private Pizza bruttaPizza;
//
//    @Autowired
//    @Qualifier("salamiPizza")
//    private Pizza pizzaSalame;

    @Override
    public void run(String... args) throws Exception {
        Pizza pizzaMargherita = new Pizza("Pizza Margherita", 1104, 4.99);
        Toppings formaggio = toppingServices.findCheese(cheese.getName()).getFirst();
        pizzaMargherita.addTopping(formaggio);
        pizzaServices.savePizza(pizzaMargherita);
//        pizzaServices.savePizza(bruttaPizza);
//        pizzaServices.savePizza(pizzaSalame);
    }
}
