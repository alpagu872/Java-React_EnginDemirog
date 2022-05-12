package F_UcuncuGunOdevler.E_KodlamaIo;

public class Main {
    public static void main(String[] args) {
        Student hindiHasan = new Student();
        hindiHasan.userName = "HasanAkgünxxKRALTR";

        StudentManager studentManager = new StudentManager();
        studentManager.add(hindiHasan);
        studentManager.addACourse(hindiHasan);
    }
}
