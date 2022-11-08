package com.br.cielo.apireunioes.controller;


import com.br.cielo.apireunioes.model.Reunioes;
import com.br.cielo.apireunioes.service.ApiReunioesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/reunioes")
public class ApiReunioesController {

    @Autowired
    ApiReunioesService apiReunioesService;

    @GetMapping
    public ModelAndView getReunioes() {
        ModelAndView mv = new ModelAndView("reunioes");
        List<Reunioes> reunioes = apiReunioesService.findall();
        mv.addObject("reunioes", reunioes);
        return mv;
    }
}
