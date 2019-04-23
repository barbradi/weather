package org.santander.cucumber.restDemo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class County {

    private String name;
    private int temperature;
    private boolean isRaining;
}
