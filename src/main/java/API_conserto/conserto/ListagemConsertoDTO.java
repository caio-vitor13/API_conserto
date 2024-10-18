package API_conserto.conserto;

public record ListagemConsertoDTO(
        String dataEntrada,
        String dataSaida,
        String nome,
        String marca,
        String modelo)
        {
            public ListagemConsertoDTO(Conserto conserto){
                this(conserto.getDataEntrada(), conserto.getDataSaida(),
                        conserto.getMecanico().getNome(), conserto.getVeiculo().getMarca(),
                        conserto.getVeiculo().getModelo());

            }

        }
