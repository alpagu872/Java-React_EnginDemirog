package oopIntro.Odev1;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course(1, "Math", "Hasan AKGÜN");
        Course course2 = new Course(2, "Music", "Hasan AKGÜN");
        Course course3 = new Course(3, "Drawing", "Hasan AKGÜN");


        CourseManager courseManager = new CourseManager();


        Course[] kurslar = {course1, course2, course3};

        for (Course c : kurslar) {
            System.out.println(c.name);
        }

        courseManager.addCourse(course1);
        courseManager.removeCourse(course3);
    }


}
