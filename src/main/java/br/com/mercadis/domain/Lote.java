package br.com.mercadis.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public @Data class Lote {

    @ManyToOne(cascade = CascadeType.PERSIST)
    private @Valid Produto produto;

    @Id
    private int referencia;

    @Max(value = 99, message = "O máximo de produtos em um lote é 99")
    @Min(value = -2, message = "O valor mínimo do lote é -2")
    @NotNull(message = "A quantidade não pode ser nula")
    private int quantidade;

    @Digits(integer = 2,fraction = 2, message = "Valor de compra inválido")
    private BigDecimal valorCompra;

    @Digits(integer = 2,fraction = 2, message = "Valor de venda inválido")
    private BigDecimal valorVenda;

    private LocalDate dataValidade;
}
