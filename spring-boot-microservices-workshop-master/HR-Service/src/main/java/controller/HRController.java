package main.java.controller;

@Controller
public class HRController {

    @RequestMapping("/user/{employeeID}")
    public UserRating getUserRatings(@PathVariable("grade") String grade, @PathVariable("experienceYears") String expYears) {
        UserRating userRating = new UserRating();
     //   userRating.initData(userId);
        return userRating;

    }
}
