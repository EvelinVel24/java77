package src.main.java.com.ferreteria.clarita.entity;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String rol; // Puede ser "ADMIN" o "CLIENTE"
}
