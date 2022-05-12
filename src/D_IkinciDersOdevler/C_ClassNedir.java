package D_IkinciDersOdevler;

public class C_ClassNedir {
    public static void main(String[] args) {
        //Classlar referans tiptir.
        C_CustomerManager customerManager = new C_CustomerManager();
        C_CustomerManager customerManager2 = new C_CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

    }
}

