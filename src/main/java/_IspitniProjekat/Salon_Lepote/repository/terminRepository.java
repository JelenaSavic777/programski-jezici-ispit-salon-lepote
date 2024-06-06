package _IspitniProjekat.Salon_Lepote.repository;


import _IspitniProjekat.Salon_Lepote.entity.klijenat;
import _IspitniProjekat.Salon_Lepote.entity.termin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.util.List;

public interface terminRepository extends JpaRepository<termin, Integer>{
    List<termin> findByVremeContains(String vreme);

}
