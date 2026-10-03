package com.bridgelabz.java_generics;
import java.util.ArrayList;
import java.util.List;

abstract class CourseType {
    String courseName;
    CourseType(String courseName){
        this.courseName=courseName;
    }
    public void display(){
        System.out.println(courseName);
    }
}
class ExamCourse extends CourseType{
    ExamCourse(String courseName){
        super(courseName);
    }
}
class AssignmentCourse extends CourseType{
    AssignmentCourse(String courseName){
        super(courseName);
    }
}
class ResearchCourse extends CourseType{
    ResearchCourse(String courseName){
        super(courseName);
    }
}
class Course<T extends CourseType>{
    private List<T> courses=new ArrayList<>();
    public void setCourse(T course){
        courses.add(course);
    }
    public List<T> getCourses(){
        return courses;
    }
}
class UniversityCourseManagement{
    public static void displayCourses(List<? extends CourseType> courses){
        for(CourseType course : courses){
            course.display();
        }
    }

    public static void main(String[] args) {
        Course<ExamCourse> examCourseCourses=new Course<>();
        examCourseCourses.setCourse(new ExamCourse("Java"));
        examCourseCourses.setCourse(new ExamCourse("DSA"));

        Course<AssignmentCourse> assignmentCourses=new Course<>();
        assignmentCourses.setCourse(new AssignmentCourse("Web Dev"));

        Course<ResearchCourse>researchCourses=new Course<>();
        researchCourses.setCourse(new ResearchCourse("AI"));

        displayCourses(examCourseCourses.getCourses());
        displayCourses(assignmentCourses.getCourses());
        displayCourses(researchCourses.getCourses() );
    }
}
