package EsercizioG4Set5BE.yurilenzi.runners;

import EsercizioG4Set5BE.yurilenzi.entities.Toppings;
import EsercizioG4Set5BE.yurilenzi.exceptions.SameElementInsert;
import EsercizioG4Set5BE.yurilenzi.services.ToppingServices;
import jakarta.annotation.Priority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component

public class ToppingRunner implements CommandLineRunner {

    @Autowired
    ToppingServices toppingServices;

    @Autowired
    @Qualifier("cheese")
    Toppings cheese;

    @Autowired
    @Qualifier("ham")
    Toppings ham;

    @Autowired
    @Qualifier("onions")
    Toppings onions;

    @Autowired
    @Qualifier("pineapple")
    Toppings pineapple;

    @Autowired
    @Qualifier("salami")
    Toppings salami;


    @Override
    public void run(String... args) throws Exception {
        try {
            toppingServices.saveTopping(cheese);
            toppingServices.saveTopping(ham);
            toppingServices.saveTopping(onions);
            toppingServices.saveTopping(pineapple);
            toppingServices.saveTopping(salami);
        }catch (SameElementInsert e){
            System.out.println(e.getMessage());
        }
    }
}
