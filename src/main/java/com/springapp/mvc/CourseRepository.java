package com.springapp.mvc;

import java.util.ArrayList;

/**
 * User: Jamshid Asatillayev
 * Date: 9/8/2014
 * Time: 13:55 PM
 */
public class CourseRepository {

    public Course getCourse(String actorId) {
        final ArrayList<Course> courses1 = getCourses();
        for (Course course : courses1) {
            if (String.valueOf(course.getId()).equals(actorId)) {
                return course;
            }
        }

        return new Course(Integer.parseInt(actorId), "No Item");
    }

    public ArrayList<Course> getCourses() {
        final ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(new Course(1, "Test"));
        courses.add(new Course(2, "Web"));
        courses.add(new Course(3,"S"));

        return courses;
    }
}
