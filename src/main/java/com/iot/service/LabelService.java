package com.iot.service;

import com.iot.domain.Label;
import com.iot.repository.LabelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LabelService extends AbstractService<Label> {
    @Autowired
    public LabelService(LabelRepository repository) {
        super(repository);
    }
}
