package com.pankoma.app.Controller;

import com.pankoma.app.Domain.UserRating;
import com.pankoma.app.Repository.UserRatingRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserRatingController {
    private static final Logger log = LoggerFactory.getLogger(UserRatingController.class);

    @Autowired
    private UserRatingRepository userRatingRepository;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/userRating")
    public ResponseEntity postUserRating(@RequestBody UserRating userRating) {
        log.info("POST UserRating: " + userRating);
        this.userRatingRepository.insert(userRating);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
