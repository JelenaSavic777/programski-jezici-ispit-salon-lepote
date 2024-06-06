package _IspitniProjekat.Salon_Lepote.controller;

import _IspitniProjekat.Salon_Lepote.entity.klijenat;
import _IspitniProjekat.Salon_Lepote.service.klijenatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/klijenat")
@RequiredArgsConstructor
@CrossOrigin

public class klijentController {
    private final klijenatService service;

    @GetMapping()
    public List<klijenat> getAllKlijents() {
        return service.getAllKlijents();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<klijenat> getKlijentById(@PathVariable Integer id) {
        return ResponseEntity.of(service.getKlijentById(id));
    }

    @GetMapping(path = "/{prezime}")
    public List<klijenat> getKlijentByPrezime(@PathVariable String prezime) {
        return service.getKlijentByPrezime(prezime);
    }
}
