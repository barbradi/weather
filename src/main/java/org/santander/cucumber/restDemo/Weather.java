package org.santander.cucumber.restDemo;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class Weather {

    private LocalDateTime date;
    private List<County> counties;
}
