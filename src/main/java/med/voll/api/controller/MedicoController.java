package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.medico.DadosCadastroMedico;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("medicos")

public class    MedicoController {

    @Autowired
    private MedicoRepository repository;

    @Transactional
    @PostMapping
    public void cadastrar(@RequestBody @Valid final DadosCadastroMedico dados) {
        this.repository.save(new Medico(dados));
    }

    @GetMapping

        public List<Medico> listar() {
        return this.repository.findAll();

    }

}
