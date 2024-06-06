package _IspitniProjekat.Salon_Lepote.service;
import _IspitniProjekat.Salon_Lepote.entity.klijenat;
import _IspitniProjekat.Salon_Lepote.entity.usluga;
import _IspitniProjekat.Salon_Lepote.repository.klijenatRepository;
import _IspitniProjekat.Salon_Lepote.repository.uslugaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class uslugaService {
    private final uslugaRepository repository;

    public uslugaService(uslugaRepository repository) {
        this.repository = repository;
    }

    public List<usluga> getAllUsluge() {
        return repository.findAll();
    }

    public Optional<usluga> getUslugaById(Integer id) {
        return repository.findById(id);
    }

    public List<usluga> getUslugaByNaziv(String naziv) {
        return repository.findByNazivContains(naziv);
    }

    public List<usluga> getUslugaByCena(Integer cena) {
        return repository.findByCena(cena);
    }

}
