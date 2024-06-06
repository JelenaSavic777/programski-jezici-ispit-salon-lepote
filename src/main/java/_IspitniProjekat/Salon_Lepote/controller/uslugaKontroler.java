package _IspitniProjekat.Salon_Lepote.controller;

import _IspitniProjekat.Salon_Lepote.entity.klijenat;
import _IspitniProjekat.Salon_Lepote.entity.stilista;
import _IspitniProjekat.Salon_Lepote.entity.termin;
import _IspitniProjekat.Salon_Lepote.entity.usluga;
import _IspitniProjekat.Salon_Lepote.service.klijenatService;
import _IspitniProjekat.Salon_Lepote.service.terminService;
import _IspitniProjekat.Salon_Lepote.service.uslugaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.util.List;

@RestController
@RequestMapping(path = "/api/usluga")
@RequiredArgsConstructor
@CrossOrigin

public class uslugaKontroler {
    private final uslugaService service;

    @GetMapping()
    public List<usluga> getAllUsluge() {
        return service.getAllUsluge();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<usluga> getUslugaById(@PathVariable Integer id) {
        return ResponseEntity.of(service.getUslugaById(id));
    }
    @GetMapping(path = "/{naziv}")
    public List<usluga> getUslugaByNaziv(@PathVariable String naziv) {
        return service.getUslugaByNaziv(naziv);
    }

    @GetMapping(path = "/{cena}")
    public List<usluga> getUslugaByCena(@PathVariable Integer cena) {
        return service.getUslugaByCena(cena);
    }
}
