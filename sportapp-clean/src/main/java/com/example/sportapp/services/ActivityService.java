// ======= Fichier : ActivityService.java (Emplacement: src/main/java/com/example/sportapp/services/) =======
package com.example.sportapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.sportapp.models.Activity;
import com.example.sportapp.repositories.ActivityRepository;
import java.util.List;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    public List<Activity> getAllActivities() {
        return activityRepository.findAll();
    }

    public Activity saveActivity(Activity activity) {
        return activityRepository.save(activity);
    }
}