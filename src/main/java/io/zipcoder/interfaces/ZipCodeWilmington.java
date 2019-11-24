package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ZipCodeWilmington {

    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();
    Student student;


    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.toArray(), numberOfHours);
    }


    public void hostLecture(long id, double numberOfHours) {
        Instructor instructor = instructors.findById(id);          //pulling a specific instructor by id using the instructors method and then casting the instructor to instructor to use the teacher interface.
        instructor.lecture(students.toArray(), numberOfHours);
    }


    public HashMap<Student, Double> getStudyMap() {

        HashMap<Student, Double> totalStudyTimeMap = new HashMap<Student, Double>();
        for (Student student : Students.getInstance().toArray()) {
            totalStudyTimeMap.put(student, student.getTotalStudyTime());
        }
        return totalStudyTimeMap;
    }


}
