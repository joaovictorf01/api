package med.voll.api.controller;

import org.springframework.web.bind.annotation.RequestBody;

@RequestMapping("pacientes")
public class PacienteController {
    public void cadastrar(@RequestBody DadosCadastroPaciente dados) {
        System.out.println("dados recebido: " +dados);

}
