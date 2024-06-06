package _IspitniProjekat.Salon_Lepote.controller;

import _IspitniProjekat.Salon_Lepote.entity.klijenat;
import _IspitniProjekat.Salon_Lepote.entity.stilista;
import _IspitniProjekat.Salon_Lepote.service.klijenatService;
import _IspitniProjekat.Salon_Lepote.service.stilistaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/stilista")
@RequiredArgsConstructor
@CrossOrigin

public class stilistaKontroler {

    private final stilistaService service;

    @GetMapping()
    public List<stilista> getAllStilisti() {
        return service.getAllStilisti();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<stilista> getStilistById(@PathVariable Integer id) {
        return ResponseEntity.of(service.getStilistaById(id));
    }

    @GetMapping(path = "/{pozicija}")
    public List<stilista> getStilistaByPozicija(@PathVariable String pozicija) {
        return service.getStilistaByPozicija(pozicija);
    }
}
