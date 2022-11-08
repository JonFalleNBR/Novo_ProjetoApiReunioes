package com.br.cielo.apireunioes.repository;

import com.br.cielo.apireunioes.model.Reunioes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiReunioesRepository extends JpaRepository<Reunioes, Long>{
}

