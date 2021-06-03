package proj.dev1.dev.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import proj.dev1.dev.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
