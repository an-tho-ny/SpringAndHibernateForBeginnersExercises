/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springandhibernateforbeginners.exercises.project02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author anthu
 */
public class AnnotationDemoApp {
    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextProject02.xml");
        
        Coach coach = context.getBean("thatSillyCoach", Coach.class);
        
        System.out.println(coach.getDailyWorkout());
        
        context.close();
    }
}
