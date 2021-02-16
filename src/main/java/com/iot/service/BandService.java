package com.iot.service;

import com.iot.domain.Band;
import com.iot.repository.BandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BandService extends AbstractService<Band> {
    @Autowired
    public BandService(BandRepository repository) {
        super(repository);
    }
}
