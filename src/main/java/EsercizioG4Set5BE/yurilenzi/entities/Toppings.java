package EsercizioG4Set5BE.yurilenzi.entities;

import jakarta.persistence.Entity;

@Entity
public class Toppings extends Prodotto {



   public Toppings(){

   }

    public Toppings(int calories, double price, String name) {
        super(name, calories, price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "\n" + name +
                        "  calories: " + calories +
                        "  price: " + price;
    }
}
