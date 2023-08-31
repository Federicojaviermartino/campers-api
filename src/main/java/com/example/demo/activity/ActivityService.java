package com.example.demo.activity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {
    private final ActivityInterface activityInterface;
    @Autowired
    public ActivityService(final ActivityInterface activityInterface){
        this.activityInterface = activityInterface;
    }
    public Activity create(Activity activity) {
        return this.activityInterface.save(activity);
    }
}
