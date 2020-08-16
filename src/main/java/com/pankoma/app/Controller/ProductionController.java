package com.pankoma.app.Controller;

import com.pankoma.app.Domain.Production;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductionController {
    private static final Logger log = LoggerFactory.getLogger(ProductionController.class);

    @Autowired
    private Environment env;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/production")
    public Production getProduction(@RequestParam(value = "name") String productionName) {
        log.info("GET Production: " + productionName);
        final String apiKey = "&apikey=" + env.getProperty("omdb.apikey");
        final String uri = "http://www.omdbapi.com/?t=" + productionName + apiKey;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, Production.class);
    }
}