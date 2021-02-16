package com.iot.controller;

import com.iot.domain.Band;
import com.iot.service.BandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/band", produces = MediaType.APPLICATION_JSON_VALUE)
public class BandController extends AbstractController<Band> {

    @Autowired
    public BandController(BandService bandService) {
        super(bandService);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Band> updateObject(@PathVariable final Integer id,
                                                 @RequestBody final Band band) {
        band.setId(id);
        Band oldBand = service.updateObject(id, band, new Band());
        return oldBand == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(oldBand, HttpStatus.OK);
    }
}