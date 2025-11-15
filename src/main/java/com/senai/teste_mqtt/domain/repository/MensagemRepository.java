package com.senai.teste_mqtt.domain.repository;

import com.senai.teste_mqtt.domain.entity.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensagemRepository extends JpaRepository<Mensagem, String> {
}
