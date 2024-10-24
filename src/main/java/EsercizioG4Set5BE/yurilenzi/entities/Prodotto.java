package EsercizioG4Set5BE.yurilenzi.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "prodotti")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Prodotto {
    @Id
    @GeneratedValue()
    @Column(name = "id_prodotto")
    protected long idProdotto;
    protected String name;
    protected int calories;
    protected double price;

    public Prodotto(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    public Prodotto() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
