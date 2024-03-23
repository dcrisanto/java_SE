public class Casting {
    public static void main(String[] args) {
        //En un año ubique a 30 perritos
        //Cuántos al mes
        int yearDogs = 30;
        int monthsYear = 12;
        double monthyDogs = yearDogs/monthsYear;
        System.out.println(monthyDogs); // result double, redondeo inferior, casteo automático
        double monthDogs = 30.0/12.0; // result double
        System.out.println(monthDogs);
        //Estimación
        double yearDogsDouble = 30.0;
        double monthsYearDouble = 12.0;
        int estimatedMonthlyDogs = (int) (yearDogsDouble/monthsYearDouble);
        System.out.println(estimatedMonthlyDogs);

        //Exactitud
        int a = 30;
        int b = 12;
        System.out.println((int) a/b); //int
        System.out.println((double) a/b); //casteo

        char n = '1';
        int nInt = n; //casteo automatico porque un char es más pequeño que un int
        System.out.println(nInt);
        double p = 3.0;
        int bp = (int) (p*2); //casteo porque double es más grande que int

        short nS = (short) n; //casteo
    }
}
