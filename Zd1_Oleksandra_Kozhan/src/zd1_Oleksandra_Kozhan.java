public class zd1_Oleksandra_Kozhan {
    public static void main(String[] args) {


        System.out.println('a' + 'b');
        System.out.println("Wartość jest kompilowana, w systemie Ascii a = 97, b = 98, w sumie daje to 195");

        System.out.println("\"");
        System.out.println("Jeśli zapiszemy podwójne cudzysłowy, kompilator po prostu nie zrozumie, w którym momencie kończy się inicjalizacja zmiennej str.");
        System.out.println(" W tym celu ekranujemy znak specjalny." );

        System.out.println("Jaki jest wynik na takie dodawanie? " + 1 + 2 + 3);

        System.out.println(1 + 2 + 3 + " A jaki jest będzie tutaj?");

        System.out.println("Jaki wynik na takie dodawanie? " + (1 + 2 + 3));
        System.out.println("+, które mamy zapisane w pierwszym wariancie, oznacza łączenie łańcuchów, a nie dodawanie");
        System.out.println(" ponieważ jest napisane z lewym kontekstem jako wartość ciągu.");

        // typy danych byte czyli 8 bitowa liczba calkowita
        boolean boolExample = !(true);
        System.out.println(boolExample);

        byte bySecond = (byte)135;
        System.out.println(bySecond);

        // dlaczego tutaj jest błąd?

        char c = 0x6d;
        char d = 0155;
        System.out.println(c + " = " + d);
        System.out.println("char c jest zapisywany w systemie szesnastkowymsystemie, ");
        System.out.println("char d w ósemkowym systemie liczbowym");
        System.out.println("obie wartości w systemie Ascii są równe m");

        double roundingExample = 2.0 - 1.9;
        System.out.println(roundingExample);
        System.out.println("Część po punkcie jest przechowywana nie jako liczba, ale jako wykładnik...");
        System.out.println("Powodem takiego wyniku jest to, że Java przestrzega ");
        System.out.println("standardu IEEE 754 do przechowywania liczb zmiennoprzecinkowych.");

        // jakie wartości przyjmuje a
        System.out.println("zmienna int ma ograniczoną liczbę, która wynosi od -2147483648 do 2147483647. ");
        System.out.println("Kiedy dodajemy pierwszy i drugi raz obliczeniajest w granicach wielkości, a trzeci i czwarty, to wartości wykraczają poza liczbę ");
        System.out.println("i w momencie gdy wykracza poza granice, zaczyna swoją drogę od swojej liczby początkowej w naszym przypadku jest to -2147483648");
        int a = 1000000000;

        System.out.println("Tutaj jest zmienna wartość: " + a);

        a += 1000000000;

        System.out.println("Tutaj jest zmienna wartość: " + a);

        a += 1000000000;

        System.out.println("Tutaj jest zmienna wartość: " + a);

        a += 1000000000;

        System.out.println("Tutaj jest zmienna wartość: " + a);

        System.out.println(2147483647 + 1);
        System.out.println(2147483647L + 1);

    }
}
