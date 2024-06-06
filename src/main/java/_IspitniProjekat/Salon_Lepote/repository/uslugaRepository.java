package _IspitniProjekat.Salon_Lepote.repository;

import _IspitniProjekat.Salon_Lepote.entity.klijenat;
import _IspitniProjekat.Salon_Lepote.entity.stilista;
import _IspitniProjekat.Salon_Lepote.entity.usluga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface uslugaRepository extends JpaRepository<usluga, Integer>{
    List<usluga> findByNazivContains(String naziv);

    List<usluga> findByCena(Integer cena);


}
