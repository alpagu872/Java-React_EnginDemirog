package F_UcuncuGunOdevler.E_KodlamaIo;

public class StudentManager extends UserManager {
    public void addACourse(Student student){
        System.out.println("Öğrenci Kursa Eklendi : " + student.userName );
    }
    public void removeFromCourse(Student student){
        System.out.println("Öğrenci Kurstan Kaldırıldı: " + student.userName);
    }

    public void studentAgeCheck(Student student){
        System.out.println("Öğrencinin yaşı: " + student.age);
    }
}
