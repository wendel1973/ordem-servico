package main.java.com.rfinformatica.ordem.servico.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity
@Table(name = "tb_ordem_servico")
public class OrdemServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @NotNull(message = "Cliente é obrigatório")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Cliente cliente;

    @NotNull(message = "Data é obrigatória")
    @Column(name = "data", updatable = false)
    private LocalDate data = LocalDate.now();

    @JsonManagedReference
    @OneToMany(mappedBy = "ordem", cascade = CascadeType.ALL, orphanRemoval = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Set<ItemOrdem> itens = new HashSet<>();

    @NotNull(message = "Valor total é obrigatório")
    @Column(name = "valor_total", updatable = true)
    private BigDecimal valorTotal = BigDecimal.ZERO;


}
