package proj.dev1.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proj.dev1.dev.model.Compra;

public interface CompraRepository extends JpaRepository<Compra,Long> {
}
