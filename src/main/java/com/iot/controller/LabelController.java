package com.iot.controller;

import com.iot.domain.Label;
import com.iot.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/label", produces = MediaType.APPLICATION_JSON_VALUE)
public class LabelController extends AbstractController<Label> {

    @Autowired
    public LabelController(LabelService labelService) {
        super(labelService);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Label> updateObject(@PathVariable final Integer id,
                                                   @RequestBody final Label label) {
        label.setId(id);
        Label oldLabel = service.updateObject(id, label, new Label());
        return oldLabel == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(oldLabel, HttpStatus.OK);
    }
}