package com.springapp.mvc;/* ActorFormatter.java */

//Removed the imports for brevity

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component("courseFormatter")
public class CourseFormatter implements Formatter<Course> {
    private CourseRepository courseRepository=new CourseRepository();


    @Override
    public String print(Course course, Locale arg1) {
        return course.getName();
    }

    @Override
    public Course parse(String actorId, Locale arg1)  {
        return courseRepository.getCourse(actorId);
    }
}