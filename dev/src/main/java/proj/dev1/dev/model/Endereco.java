package proj.dev1.dev.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String rua;
    private int cep;
    private String cidade;
    private String estado;
    private String complemento;
    private String bairro;
    private int numero;

}
