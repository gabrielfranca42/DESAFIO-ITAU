package dto;


import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.time.OffsetDateTime;
@Getter
public class TransactionRequest {

    @NotNull
    private double valor;

    @NotNull
    private OffsetDateTime dataHora;

    public double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
}
