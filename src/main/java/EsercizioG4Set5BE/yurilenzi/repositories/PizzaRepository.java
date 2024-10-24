package EsercizioG4Set5BE.yurilenzi.repositories;

import EsercizioG4Set5BE.yurilenzi.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {

   boolean existsByName(String nome);
}
