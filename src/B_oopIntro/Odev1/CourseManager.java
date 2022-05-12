package B_oopIntro.Odev1;

public class CourseManager {
    public void addCourse(Course course) {
        System.out.println("Kurs eklendi. " + course.name);
    }

    public void removeCourse(Course course) {
        System.out.println("Kurs kaldırıldı." + course.name);
    }
}
