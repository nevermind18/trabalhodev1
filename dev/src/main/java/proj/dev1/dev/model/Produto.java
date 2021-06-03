package proj.dev1.dev.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Produto{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String nome;
    private Double valor;
    private String descricao;
    private int quantidade;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Fornecedor fornecedor;

}
