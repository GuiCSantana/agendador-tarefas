package com.guilherme.agendadortarefas.infrastructure.repository;

import com.guilherme.agendadortarefas.infrastructure.entity.TarefasEntity;
import io.jsonwebtoken.lang.Strings;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefasRepository extends MongoRepository<TarefasEntity, Strings> {
}
