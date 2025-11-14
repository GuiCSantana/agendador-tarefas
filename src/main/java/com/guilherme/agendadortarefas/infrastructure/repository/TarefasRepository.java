package com.guilherme.agendadortarefas.infrastructure.repository;

import com.guilherme.agendadortarefas.infrastructure.entity.TarefasEntity;
import io.jsonwebtoken.lang.Strings;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TarefasRepository extends MongoRepository<TarefasEntity, Strings> {

    List<TarefasEntity> findBydataEventoBetween(LocalDateTime dataInicial, LocalDateTime dataFinal);

    List<TarefasEntity> findByEmailUsuario(String email);

}
