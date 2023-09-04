package com.example.demo.activity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping (value = "activity",method = {
        RequestMethod.GET,
        RequestMethod.POST ,
        RequestMethod.DELETE,
        RequestMethod.PUT
})
public class ActivityController {
    private final ActivityService activityService;
    @Autowired
    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @PostMapping ("/post")
    public ResponseEntity <Activity> create(@RequestBody Activity activity) {
        Activity created = activityService.create(activity);
                return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

}
