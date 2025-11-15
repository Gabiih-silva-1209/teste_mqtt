package com.senai.teste_mqtt.application.dto;

import lombok.Builder;

@Builder
public record MensagenRestDTO(
        String nome,
        String conteudo
) {
}
