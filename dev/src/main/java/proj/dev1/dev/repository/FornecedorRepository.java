package proj.dev1.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proj.dev1.dev.model.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
}
