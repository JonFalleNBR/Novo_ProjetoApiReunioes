package com.br.cielo.apireunioes.service.impl;


import com.br.cielo.apireunioes.model.Reunioes;
import com.br.cielo.apireunioes.repository.ApiReunioesRepository;
import com.br.cielo.apireunioes.service.ApiReunioesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@EnableScheduling
public class ApiReunioesServiceImpl implements ApiReunioesService {

    @Autowired
    ApiReunioesRepository apiReunioesRepository;

    @Override
    public List<Reunioes> findall() {
        return apiReunioesRepository.findAll();
    }


}
