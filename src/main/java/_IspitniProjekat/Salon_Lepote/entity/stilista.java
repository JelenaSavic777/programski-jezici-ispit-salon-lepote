package _IspitniProjekat.Salon_Lepote.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity(name = "stilista")
@NoArgsConstructor
@Getter
@Setter

public class stilista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_stiliste")
    private Integer id;

    @Column(nullable = false)
    private String ime;

    @Column(nullable = false)
    private String prezime;

    @Column(nullable = false)
    private Integer godine;

    @Column(nullable = false)
    private String pozicija;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_usluge", nullable = false)
    private usluga usluga;
}
