package proj.dev1.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proj.dev1.dev.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco,Long> {
}
