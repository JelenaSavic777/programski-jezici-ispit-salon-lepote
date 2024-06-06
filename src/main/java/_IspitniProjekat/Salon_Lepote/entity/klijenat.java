package _IspitniProjekat.Salon_Lepote.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity(name = "klijenat")
@NoArgsConstructor
@Getter
@Setter

public class klijenat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_klijenta")
    private Integer id;

    @Column(nullable = false)
    private String ime;

    @Column(nullable = false)
    private String prezime;

    @Column(nullable = false)
    private String adresa;

    @Column(nullable = false)
    private Integer telefon;

    @OneToMany(mappedBy = "klijent")
    private List<termin> termini;
}
