package API_conserto.conserto;

import API_conserto.mecanico.MecanicoDTO;
import API_conserto.veiculo.VeiculoDTO;

public record ConsertoDTO(
        String horaEntrada,
        String horaSaida,
        MecanicoDTO mecanico,
        VeiculoDTO veiculo) {
}