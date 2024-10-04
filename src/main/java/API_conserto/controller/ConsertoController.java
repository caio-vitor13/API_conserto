package API_conserto.controller;

import API_conserto.conserto.Conserto;
import API_conserto.conserto.ConsertoDTO;
import API_conserto.repository.ConsertoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consertos")
public class ConsertoController {

    @Autowired
    private ConsertoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody ConsertoDTO dados){
        System.out.println(dados);
        repository.save(new Conserto(dados));
    }
}
