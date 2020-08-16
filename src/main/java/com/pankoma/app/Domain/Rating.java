package com.pankoma.app.Domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rating {
    @JsonProperty("Source")
    private String source;
    @JsonProperty("Value")
    private String value;

    public Rating() {
    }
}
