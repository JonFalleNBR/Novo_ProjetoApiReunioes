package com.br.cielo.apireunioes.service.impl;


import com.br.cielo.apireunioes.model.dtos.Reunioes;
import com.br.cielo.apireunioes.repository.ApiReunioesRepository;
import com.br.cielo.apireunioes.service.ApiReunioesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiReunioesServiceImpl implements ApiReunioesService {

    ApiReunioesRepository apiReunioesRepository;

    @Override
    public List<Reunioes> findall() {
        return apiReunioesRepository.findAll();
    }


}
