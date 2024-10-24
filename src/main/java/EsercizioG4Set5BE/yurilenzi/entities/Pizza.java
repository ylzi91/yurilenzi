package EsercizioG4Set5BE.yurilenzi.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pizze")
public class Pizza extends Prodotto {
    @ManyToMany
    @JoinTable(
            name = "pizze_toppings",
            joinColumns = @JoinColumn(name = "pizza_id"),
            inverseJoinColumns = @JoinColumn(name = "topping_id")
    )
    private List<Toppings> toppings = new ArrayList<>();

    public Pizza(){

    }
    public Pizza(String name, int calories, double price) {
        super(name, calories, price);
    }



    public List<Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(List<Toppings> toppings) {
        this.toppings = toppings;
    }

    public void addTopping(Toppings toppings) {
        this.toppings.add(toppings);
        this.price += toppings.getPrice();
    }

    @Override
    public String toString() {
        return
                "\nname: " + name +
                        "(" + toppings + ")" +
                        "   calories=" + calories +
                        " price=" + price;
    }
}
