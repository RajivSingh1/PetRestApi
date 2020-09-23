package com.udacity.DogRestApi.repository;

import com.udacity.DogRestApi.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DogRepository extends CrudRepository<Dog,Long>{
   @Query("select id,breed from Dog")
    List<String> getDogBreed();

   @Query("select id,breed from Dog where id=:id")
   String getDogBreedById(Long id);

   @Query("select id,name from Dog")
    List<String> getDogNames();
}
