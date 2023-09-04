package com.example.demo.activity;

import com.example.demo.signup.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {
    private final ActivityInterface activityInterface;
    private final ModelMapper modelMapper
    @Autowired
    public ActivityService(final ActivityInterface activityInterface){
        this.activityInterface = activityInterface;
    }
    public Activity create(Activity activity) {
        return this.activityInterface.save(activity);
    }
}
