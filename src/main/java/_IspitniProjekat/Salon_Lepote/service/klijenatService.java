package _IspitniProjekat.Salon_Lepote.service;

import _IspitniProjekat.Salon_Lepote.entity.klijenat;
import _IspitniProjekat.Salon_Lepote.repository.klijenatRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
public class klijenatService {

    private final klijenatRepository repository;

    public klijenatService(klijenatRepository repository) {
        this.repository = repository;
    }

    public List<klijenat> getAllKlijents() {
        return repository.findAll();
    }

    public Optional<klijenat> getKlijentById(Integer id) {
        return repository.findById(id);
    }

    public List<klijenat> getKlijentByPrezime(String prezime) {
        return repository.findByPrezimeContains(prezime);
    }
}
