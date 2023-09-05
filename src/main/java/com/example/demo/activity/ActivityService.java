package com.example.demo.activity;

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

    @Service
    public static class ActivityService {
        @Autowired
        private ActivityRepository activityRepository;
        @Autowired
        private ModelMapper modelMapper;

        public Activity addActivity(@Valid Activity activity){
            return activityRepository.save(activity);
        }
    }
}
