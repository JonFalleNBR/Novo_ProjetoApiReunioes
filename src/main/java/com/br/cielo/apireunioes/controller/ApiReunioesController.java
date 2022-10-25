package com.br.cielo.apireunioes.controller;


import com.br.cielo.apireunioes.model.dtos.Reunioes;
import com.br.cielo.apireunioes.service.ApiReunioesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ApiReunioesController {

    @Autowired
    ApiReunioesService apiReunioesService;

    @RequestMapping(value = "/reunioes", method = RequestMethod.GET)
    public ModelAndView getReunioes() {
        ModelAndView mv = new ModelAndView("reunioes");
        List<Reunioes> posts = apiReunioesService.findall();
        mv.addObject("reunioes", posts);
        return mv;
    }
}
