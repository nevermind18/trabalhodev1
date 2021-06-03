package proj.dev1.dev.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String nome;
    private int cpf;
    private int rg;
    @JsonFormat(pattern="dd-mm-yyyy")
    private Date dataNasc;

    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private Endereco endereco;


}
