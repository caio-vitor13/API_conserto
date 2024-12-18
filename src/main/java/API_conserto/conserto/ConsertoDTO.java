package API_conserto.conserto;

import API_conserto.mecanico.MecanicoDTO;
import API_conserto.veiculo.VeiculoDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record ConsertoDTO(
        @Pattern(regexp = "\\d{2}/\\d{2}/\\d{4}", message = "A data deve estar no formato dd/MM/yyyy")
        String dataEntrada,

        @Pattern(regexp = "\\d{2}/\\d{2}/\\d{4}", message = "A data deve estar no formato dd/MM/yyyy")
        String dataSaida,

        @NotNull
        @Valid
        MecanicoDTO mecanico,

        @NotNull
        @Valid
        VeiculoDTO veiculo) {
}