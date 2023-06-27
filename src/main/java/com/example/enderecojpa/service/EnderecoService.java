package com.example.enderecojpa.service;

import com.example.enderecojpa.entity.Endereco;
import com.example.enderecojpa.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco salvarEndereco (Endereco endereco){
        enderecoRepository.save(endereco);
        return enderecoRepository.save(endereco);
    }
    public Endereco buscarEndereco (Long id){
        return enderecoRepository.findById(id).get();
    }

    public Endereco buscarEnderecoPorCidade (String cidade){
        return enderecoRepository.findByCidade(cidade);

    }
    public Endereco buscarEnderecoPorCep (String cep){
        return enderecoRepository.findByCep(cep);

    }
    public Endereco buscarEnderecoPorRua (String rua){
        return enderecoRepository.findByRua(rua);

    }

    public List<Endereco> buscarEnderecos (){
        return  enderecoRepository.findAll();
    }

    public void apagarEndereco (Long id){
        if(enderecoRepository.existsById(id)) {
            enderecoRepository.deleteById(id);
        }else {
            throw new RuntimeException("Endereco não encontrado");
        }
    }
    public Endereco atulizarEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }
}


