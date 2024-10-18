package API_conserto.controller;

import API_conserto.conserto.Conserto;
import API_conserto.conserto.ConsertoDTO;
import API_conserto.conserto.ListagemConsertoDTO;
import API_conserto.repository.ConsertoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("consertos")
public class ConsertoController {

    @Autowired
    private ConsertoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid ConsertoDTO dados){
        System.out.println(dados);
        repository.save(new Conserto(dados));
    }

    @GetMapping
    public Page<Conserto> listar(Pageable paginacao) {
        return repository.findAll(paginacao);
    }

    @GetMapping("algunsdados")
    public List<ListagemConsertoDTO> listarAlgunsDados() {
        return repository.findAll().stream().map(ListagemConsertoDTO::new).toList();
    }
}
