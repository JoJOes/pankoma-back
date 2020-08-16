package com.pankoma.app.Repository;

import com.pankoma.app.Domain.UserRating;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRatingRepository extends MongoRepository<UserRating, Integer> {
}
