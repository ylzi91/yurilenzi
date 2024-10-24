package EsercizioG4Set5BE.yurilenzi.services;

import EsercizioG4Set5BE.yurilenzi.entities.Toppings;
import EsercizioG4Set5BE.yurilenzi.exceptions.SameElementInsert;
import EsercizioG4Set5BE.yurilenzi.repositories.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToppingServices {
    @Autowired
    private ToppingRepository toppingRepository;

    public void saveTopping(Toppings newTopping){

        if(toppingRepository.existsByName(newTopping.getName())) throw new SameElementInsert(newTopping.getName());
        toppingRepository.save(newTopping);
    }

    public List<Toppings> findCheese(String cheese){
        return toppingRepository.findByName(cheese);
    }
}
