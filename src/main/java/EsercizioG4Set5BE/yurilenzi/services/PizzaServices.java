package EsercizioG4Set5BE.yurilenzi.services;

import EsercizioG4Set5BE.yurilenzi.entities.Pizza;
import EsercizioG4Set5BE.yurilenzi.exceptions.SameElementInsert;
import EsercizioG4Set5BE.yurilenzi.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaServices {
    @Autowired
    PizzaRepository pizzaRepository;

    public void savePizza(Pizza newPizza){
        //if(pizzaRepository.existsByName(newPizza.getName())) throw new SameElementInsert(newPizza.getName());

        pizzaRepository.save(newPizza);
    }
}
