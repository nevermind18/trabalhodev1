package proj.dev1.dev.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String nome;
    private String nomeFantasia;
    private int cnpj;
    private int telefone;

    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private Endereco endereco;

}
