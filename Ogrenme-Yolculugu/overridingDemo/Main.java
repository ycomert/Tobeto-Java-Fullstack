package overridingDemo;

public class Main {

    public static void main(String[] args) {
        BaseKrediManager[] krediManagers =
                {new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};

        for(BaseKrediManager krediManager: krediManagers) {
            System.out.println(krediManager.calculate(1000));
        }
    }
}
