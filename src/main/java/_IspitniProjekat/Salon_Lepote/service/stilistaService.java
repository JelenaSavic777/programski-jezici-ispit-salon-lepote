package _IspitniProjekat.Salon_Lepote.service;

import _IspitniProjekat.Salon_Lepote.entity.klijenat;
import _IspitniProjekat.Salon_Lepote.entity.stilista;
import _IspitniProjekat.Salon_Lepote.repository.klijenatRepository;
import _IspitniProjekat.Salon_Lepote.repository.stilistaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class stilistaService {
    private final stilistaRepository repository;

    public stilistaService(stilistaRepository repository) {
        this.repository = repository;
    }

    public List<stilista> getAllStilisti() {
        return repository.findAll();
    }

    public Optional<stilista> getStilistaById(Integer id) {
        return repository.findById(String.valueOf(id));
    }

    public List<stilista> getStilistaByPozicija(String pozicija) {
        return repository.findByPozicijaContains(pozicija);
    }
}
