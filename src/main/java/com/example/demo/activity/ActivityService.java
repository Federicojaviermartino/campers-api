package com.example.demo.activity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {
    private final ActivityInterface activityInterface;
    @Autowired
    public ActivityInterface (ActivityInterface activityInterface {
        this.activityInterface = activityInterface;
    }
    public Activity created(Activity activity) {
        return ActivityInterface.save (activity) ;
    };
}
