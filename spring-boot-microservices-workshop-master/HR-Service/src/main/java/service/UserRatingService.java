package main.java.service;

import main.java.model.Rating;

@Service
public Interface UserRatingService {

@Autowire
Rating rating;


public int getFinalExperience(int grade, int exp)
return grade+exp+1;

}
