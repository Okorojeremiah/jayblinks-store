package store.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import store.data.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
