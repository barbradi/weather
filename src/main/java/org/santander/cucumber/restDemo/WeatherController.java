package org.santander.cucumber.restDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class WeatherController {

    @GetMapping("/weather")
    public Weather getweather() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        Weather weather = Weather.builder()
                .date(LocalDateTime.now())
                .counties(new ArrayList<County>(){{
                    add(County.builder().name("Buckinghamshire").temperature(3).isRaining(false).build());
                    add(County.builder().name("Cambridgeshire").temperature(4).isRaining(true).build());
                    add(County.builder().name("Bedfordshire").temperature(5).isRaining(false).build()); }})
                .build();

        return weather;
    }
}



