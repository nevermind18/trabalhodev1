package proj.dev1.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proj.dev1.dev.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {

}
