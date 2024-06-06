package _IspitniProjekat.Salon_Lepote.service;
import _IspitniProjekat.Salon_Lepote.entity.klijenat;
import _IspitniProjekat.Salon_Lepote.entity.termin;
import _IspitniProjekat.Salon_Lepote.repository.klijenatRepository;
import _IspitniProjekat.Salon_Lepote.repository.terminRepository;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.List;
import java.util.Optional;
@Service
public class terminService {
    private final terminRepository repository;

    public terminService(terminRepository repository) {
        this.repository = repository;
    }

    public List<termin> getAllTermini() {
        return repository.findAll();
    }

    public Optional<termin> getTerminById(Integer id) {
        return repository.findById(id);
    }

    public List<termin> getTerminByVreme(String vreme) {
        return repository.findByVremeContains(vreme);
    }
}
