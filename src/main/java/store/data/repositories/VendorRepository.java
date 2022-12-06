package store.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import store.data.models.Vendor;


public interface VendorRepository extends JpaRepository<Vendor, Integer> {
}
