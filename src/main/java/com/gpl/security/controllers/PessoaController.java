package com.gpl.security.controllers;

import com.gpl.security.models.PessoaModel;
import com.gpl.security.repositories.PessoaRepository;
import com.gpl.security.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/pessoas")
@RestController
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping
    public List<PessoaModel> listarPessoas() {
        return pessoaService.findAll();
    }

    @PostMapping
    public PessoaModel criarPessoa(@RequestBody PessoaModel pessoaModel) {
        return pessoaService.criarPessoa(pessoaModel);
    }

    @DeleteMapping("/{id}")
    public void deletarPessoa(@PathVariable Long id){
        pessoaRepository.deleteById(id);
    }

}
