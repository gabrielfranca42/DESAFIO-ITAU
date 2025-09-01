package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class transaction {

    private double valor;
    private OffsetDateTime dataHora;





}
