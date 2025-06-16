package main.java.com.rfinformatica.ordem.servico.model;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Entity
@Table(name = "tb_servico")
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeServico;
    
     @Column(precision = 13, scale = 2)
    private Double valor;


}
