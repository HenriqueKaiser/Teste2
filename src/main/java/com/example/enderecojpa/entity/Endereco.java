package com.example.enderecojpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Endereco {
    @Id
    private Long id;
    private String rua;
    private String cidade;
    private String estado;
    private String cep;

    @OneToMany(mappedBy = "endereco")
    private List<Usuario> usuarios;


}
