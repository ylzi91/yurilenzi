package EsercizioG4Set5BE.yurilenzi.repositories;

import EsercizioG4Set5BE.yurilenzi.entities.Toppings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToppingRepository extends JpaRepository<Toppings, Long> {

    boolean existsByName(String nome);

    List<Toppings> findByName(String name);
}
