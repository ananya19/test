package main.java.controller;

@Controller
public class HRController {

    @Autowire
    UserRatingService service;
    @RequestMapping("/user/{employeeID}")
    public int getUserExp(@PathVariable("grade") String grade, @PathVariable("experienceYears") String expYears) {
        UserRating userRating = new UserRating();
     //   userRating.initData(userId);
       int finalExp = service.getFinalExperience(grade, expYears);
        return finalExp;

    }
}
