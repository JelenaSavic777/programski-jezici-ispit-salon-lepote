package _IspitniProjekat.Salon_Lepote.controller;

import _IspitniProjekat.Salon_Lepote.entity.klijenat;
import _IspitniProjekat.Salon_Lepote.entity.stilista;
import _IspitniProjekat.Salon_Lepote.entity.termin;
import _IspitniProjekat.Salon_Lepote.service.klijenatService;
import _IspitniProjekat.Salon_Lepote.service.stilistaService;
import _IspitniProjekat.Salon_Lepote.service.terminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@RequestMapping(path = "/api/termin")
@RequiredArgsConstructor
@CrossOrigin

public class terminKontroler {
    private final terminService service;

    @GetMapping()
    public List<termin> getAllTermini() {
        return service.getAllTermini();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<termin> getTerminById(@PathVariable Integer id) {
        return ResponseEntity.of(service.getTerminById(id));
    }

    @GetMapping(path = "/{vreme}")
    public List<termin> getTerminByVreme(@PathVariable String vreme) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("hh:mm:ss");
        return service.getTerminByVreme(vreme);
    }
}
