/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springandhibernateforbeginners.exercises.project02;

import org.springframework.stereotype.Component;

/**
 *
 * @author anthu
 */
@Component
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
    
}
