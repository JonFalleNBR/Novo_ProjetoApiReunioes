package com.br.cielo.apireunioes.model.config;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@ConditionalOnProperty(name = "scheduler.enabled", matchIfMissing = true) //Remover após concluir as etapas de teste
public class ReunionsScheduleConfig {


}
