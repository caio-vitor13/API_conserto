package API_conserto.conserto;

import API_conserto.mecanico.Mecanico;
import API_conserto.veiculo.Veiculo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "consertos")
@Entity(name = "Conserto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Conserto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dataEntrada;
    private String dataSaida;
    @Embedded
    private Mecanico mecanico;
    @Embedded
    private Veiculo veiculo;

    public Conserto(ConsertoDTO dto){
        this.dataEntrada = dto.dataEntrada();
        this.dataSaida = dto.dataSaida();
        this.mecanico = new Mecanico(dto.mecanico());
        this.veiculo = new Veiculo(dto.veiculo());

    }
}