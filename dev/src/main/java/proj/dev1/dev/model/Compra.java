package proj.dev1.dev.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@Entity
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private Double quantidade;

    @Column
    @ElementCollection(targetClass=Integer.class)
    private List<Produto> produtos;

    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    private Cliente cliente;

    private Double total;

    @JsonFormat(pattern = "dd-mm-yyyy")
    private Date data;

}
