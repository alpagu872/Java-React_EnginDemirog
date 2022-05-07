package IlkDersOdevler;

public class E_SayiKiyaslama {
    public static void main(String[] args) {
//        int a = 20, b = 1, c = 3212;
//        if (a < b && c < b) {
//            System.out.println(b + " En büyük sayıdır");
//        } else if (a < c && b < c){
//            System.out.println(c + " En büyük sayıdır");
//        }else {
//            System.out.println(a + " En büyük sayıdır");
//        }
//    }

        int a = 20, b = 1, c = 3212, enBuyuk;
        if (a < b && c < b) {
            enBuyuk = b;
        } else if (a < c && b < c) {
            enBuyuk = c;
        } else {
            enBuyuk = a;
        }
        System.out.println(enBuyuk + " En büyük sayıdır");
    }
}
