package com.ap3dominator.bookMyShow.repos;

import com.ap3dominator.bookMyShow.domain.City;
import com.ap3dominator.bookMyShow.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;


public interface CityRepository extends JpaRepository<City, Integer> {

    Optional<City> findById(Integer integer);

    @Query("SELECT city FROM City city")
    List<City> findAllCities();

    default void deleteCity(Integer cityId) {
        City cityToDelete = findById(cityId).
                                orElseThrow(
                                        () -> new IllegalArgumentException("City not found")
                                );
        delete(cityToDelete);
    }

}
