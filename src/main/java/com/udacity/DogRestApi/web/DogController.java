package com.udacity.DogRestApi.web;

import com.udacity.DogRestApi.entity.Dog;
import com.udacity.DogRestApi.service.DogService;
import com.udacity.DogRestApi.service.DogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {

DogService dogService;
@Autowired
public void setDogService(DogService dogService)
{
this.dogService=dogService;
}

@GetMapping("/dogs/name")
public ResponseEntity<List<String>> getnames()
{
List<String> list=dogService.retrieveDogNames();
return new ResponseEntity<List<String>>(list, HttpStatus.OK);
}
@GetMapping("/dogs/breed")
public ResponseEntity<List<String>> getbreeds()
{
List<String> list=dogService.retrieveDogBreed();
return new ResponseEntity<List<String>>(list, HttpStatus.OK);
}
@GetMapping("/dogs")
    public ResponseEntity<List<Dog>>  getAllDogs()
{
    List<Dog> list=dogService.retrieveDogs();
    return new ResponseEntity<List<Dog>>(list,HttpStatus.OK);
}

@GetMapping("/{id}/breed")
    public ResponseEntity<String> getBreedById(@PathVariable Long id)
{
    String s=dogService.retrieveDogBreedById(id);
return new ResponseEntity<String>(s,HttpStatus.OK);

}















}
