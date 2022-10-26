package com.br.cielo.apireunioes.service;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class ScheduleMethodsService {


    Logger logger = Logger.getLogger(ScheduleMethodsService.class.getName());

    @Scheduled(fixedDelay = 1000)
    public void scheduleFixedDelayTask() {
        logger.log(Level.INFO,
                "Fixed delay task - " + System.currentTimeMillis() / 1000);
    }


    @Scheduled(fixedRate = 1000)
    public void scheduleFixedRateTask() {
        logger.log(Level.INFO, "Fixed rate task - " + System.currentTimeMillis() / 1000);
    }


    @Scheduled(fixedDelay = 1000, initialDelay = 1000)
    public void scheduleFixedRateWithInitialDelayTask() {

        long now = System.currentTimeMillis() / 1000;
        logger.log(Level.INFO,
                "Fixed rate task with one second initial delay - " + now);
    }

    @Scheduled(cron = "0 15 10 15 * ?")
    public void scheduleTaskUsingCronExpression() {

        long now = System.currentTimeMillis() / 1000;
        logger.log(Level.INFO,
                "schedule tasks using cron jobs - " + now);
    }


    /*
   1 - Metodo
    Neste caso, a duração entre o final da última execução e o início da próxima execução é fixada. A tarefa sempre espera até que a anterior esteja concluída.
   Esta opção deve ser usada quando for obrigatório que a execução anterior seja concluída antes de ser novamente executado.

    2- Metodo
     Esta opção deve ser usada quando cada execução da tarefa for independente.
    Observe que as tarefas programadas não são executadas em paralelo por padrão.

    3- Metodo
    Observe como estamos usando tanto o FixDelay quanto o Atraso inicial neste exemplo. A tarefa será executada pela primeira vez após o valor inicial daDelay,
    e continuará a ser executada de acordo com aDeladia fixa.

    4 - Às vezes, atrasos e taxas não são suficientes, e precisamos da flexibilidade de uma expressão de cron para controlar o cronograma de nossas tarefas.

     */
}
