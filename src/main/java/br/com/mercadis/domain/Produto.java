package br.com.mercadis.domain;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import java.util.Set;

@Entity(name = "product")
public @Data class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank
    @Column(nullable = false, length = 100)
    private String nome;

    @Positive
    @Column(unique = true)
    private int referencia;

    @PositiveOrZero
    @NotNull
    private int estoqueMinimo;

    // Mapeado pelo campo "produto" da classe Lote
    @OneToMany(mappedBy = "produto")
    @JsonIgnore
    private Set<Lote> lotes;


}
