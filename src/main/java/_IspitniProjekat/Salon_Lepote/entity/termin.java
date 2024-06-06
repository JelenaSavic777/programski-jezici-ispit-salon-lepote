package _IspitniProjekat.Salon_Lepote.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity(name = "termin")
@NoArgsConstructor
@Getter
@Setter

public class termin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_termina")
    private Integer id;

    @Column(nullable = false)
    private String datum;

    @Column(nullable = false)
    private String vreme;

    @ManyToOne(optional = false)
    @JsonIgnore
    @JoinColumn(name = "id_klijenta", nullable = false)
    private klijenat klijent;
}
