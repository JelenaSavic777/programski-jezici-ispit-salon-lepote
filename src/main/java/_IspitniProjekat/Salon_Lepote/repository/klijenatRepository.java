package _IspitniProjekat.Salon_Lepote.repository;

import _IspitniProjekat.Salon_Lepote.entity.klijenat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface klijenatRepository extends JpaRepository<klijenat, Integer> {

    List<klijenat> findByPrezimeContains(String prezime);
}
