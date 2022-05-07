package IlkDersOdevler;

public class K_CokBoyutluDiziler {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Eskişehir";
        sehirler[0][2] = "Yenişehir";
        sehirler[1][0] = "HİHAHİHA";
        sehirler[1][1] = "Çanakkale";
        sehirler[1][2] = "Ankara";
        sehirler[2][0] = "Kırıkkale";
        sehirler[2][1] = "Falan";
        sehirler[2][2] = "Alpagu";

        for (int i = 0 ; i <= 2; i++){
            for (int j = 0; j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}
