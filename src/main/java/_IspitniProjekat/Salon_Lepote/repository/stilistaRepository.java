package _IspitniProjekat.Salon_Lepote.repository;

import _IspitniProjekat.Salon_Lepote.entity.klijenat;
import _IspitniProjekat.Salon_Lepote.entity.stilista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface stilistaRepository extends JpaRepository<stilista, String>{

    List<stilista> findByPozicijaContains(String pozicija);

}
