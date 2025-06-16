package main.java.com.rfinformatica.ordem.servico.model;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Entity
@Table(name = "tb_item_ordem")
public class ItemOrdem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Ordem de Serviço é obrigatória")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ordem_servico_id", nullable = false)
    @JsonBackReference
    private OrdemServico ordemServico;

    @ManyToOne
    @JoinColumn(name = "servico_id")
    private Servico servico;

    @NotNull(message = "Quantidade é obrigatória")
    @Min(value = 1, message = "Quantidade deve ser no mínimo 1")
    private int quantidade;

}
