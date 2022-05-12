package F_UcuncuGunOdevler.D_Overriding_39;

public class OgrenciKrediManager extends BaseKrediManager{
    @Override
    public double hesapla(double tutar) {
        return tutar * 1.10;
    }
}
