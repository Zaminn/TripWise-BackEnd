package com.example.TripWiseBackend.Repositories.Restaurant;

import com.example.TripWiseBackend.Entities.Restaurant.RestaurantRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRatingRepository extends JpaRepository<RestaurantRating, Integer> {
}
