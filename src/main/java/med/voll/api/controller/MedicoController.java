package med.voll.api.controller;

import jakarta.transaction.Transactional;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.voll.api.medico.DadosCadastroMedico;

@RestController
@RequestMapping("medicos")

public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @Transactional
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }

}
