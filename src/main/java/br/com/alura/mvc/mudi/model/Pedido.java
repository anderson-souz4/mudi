package br.com.alura.mvc.mudi.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nomeProduto;
    @Column
    private BigDecimal valorNegociado;
    @Column
    private LocalDate dataEntrega;
    @Column
    private String urlProduto;
    @Column
    private String urlImagem;
    @Column
    private String descricao;

    @Enumerated(EnumType.STRING)
    private StatusPedido statusPedido;


}
