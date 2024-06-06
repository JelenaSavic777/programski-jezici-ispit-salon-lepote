package _IspitniProjekat.Salon_Lepote.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.text.DecimalFormat;
import java.util.List;


@Entity(name = "usluga")
@NoArgsConstructor
@Getter
@Setter

public class usluga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usluge")
    private Integer id;

    @Column(nullable = false)
    private String naziv;

    @Column(nullable = false)
    private Integer cena;

    @OneToMany(mappedBy = "usluga")
    @JsonIgnore
    private List<stilista> stilisti;
}
