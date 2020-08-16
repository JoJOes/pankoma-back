package com.pankoma.app.Domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UserRating")
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserRating {
    @JsonProperty("Stars")
    private int stars;

    @JsonProperty("Explanation")
    private String explanation;

    public UserRating() {
    }

    @Override
    public String toString() {
        return "UserRating{" +
                "stars=" + stars +
                ", explanation='" + explanation + '\'' +
                '}';
    }
}
