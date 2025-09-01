package dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.time.OffsetDateTime;
@Getter
public class TransactionRequest {

    @NotNull
    @Min(0)
    private double valor;

    @NotNull
    private OffsetDateTime dataHora;

}
