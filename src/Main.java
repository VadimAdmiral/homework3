public class Main {
    public static void main(String[] args) {
        //Задача 1;

 byte a = 55;
 short b = 12500;
 int c = 175000;
 long d = 999562153L;
 System.out.println( "значение переменной a с типом  byte равно " + a );
 System.out.println ("значение переменной b с типом  short равно " + b ) ;
 System.out.println ("значение переменной c с типом  int равно " + c ) ;
 System.out.println ("значение переменной d с типом  long равно " + d ) ;
    //Задача 2;
    float x  = 27.12f;
    long q = 987678965549L;
    float w = 2.786f;
    short r = 569;
    short t = -159;
    short y = 27897;
    byte u = 67;
     //Задача 3
    byte lud  = 23;
    byte ac   = 27;
    byte ea = 30;
    short tot = 480;
    int totStudent = lud + ac + ea;
    int evStudent = tot / totStudent;
    System.out.println ( " На каждого ученика рассчитано " + evStudent + " листов бумаги");
     // Задача 4
    byte bottlesPer2Min = 16;
    byte minInHour = 60;
    byte hoursInDay = 24;
    byte daysInMonth = 30;
    int bottlesPerMin = bottlesPer2Min / 2;
    int twMin = 20 * bottlesPerMin;
    int oneDay = hoursInDay * minInHour * bottlesPerMin;
    int threeDay = oneDay * 3;
    int oneMonth = daysInMonth * oneDay;
    System.out.println ( "За 20 минут машина произвела " + twMin + " штук бутылок" );
    System.out.println ( "За сутки машина произвела " + oneDay + " штук бутылок" );
    System.out.println ( "За 3 дня машина произвела " + threeDay + " штук бутылок" );
    System.out.println ( "За 1 месяц машина произвела " + oneMonth + " штук бутылок" );
    // Задача 5
byte totalCans = 120;
byte oneClassWhite = 2;
byte oneClassBroun = 4;
int oneClassCans = oneClassWhite + oneClassBroun;
int classesAtSchool = totalCans / oneClassCans;
int whiteCansSchool = classesAtSchool * oneClassWhite;
int brounCansSchool = classesAtSchool * oneClassBroun;
System.out.println (" В школе, где " + classesAtSchool + " классов, нужно " + whiteCansSchool + " банок белой краски и " + brounCansSchool + " банок коричневой краски. ");
// Задача 6
    byte bananas = 5;
    byte oneBananWeight = 80;
    int totBananasWeight = bananas * oneBananWeight;
    byte milk = 100;
    byte oneMilkWeight = 105;
    int milkRecipe = oneMilkWeight * 2;
    int iceCream = 2 * 100;
    int eggs = 4 * 70;
    int totalWeight = totBananasWeight + milkRecipe + iceCream + eggs;
    short grPreKg = 1000;
    float totalWeightKg = totalWeight / (float)grPreKg;
    System.out.println ( totalWeight );
    System.out.println (totalWeightKg );
    //Задача 7
        byte loseWKg = 7;
        int loseVGr = loseWKg * 1000 ;
        short loseWInDayMin = 250;
        short loseWInDayMax = 500;
        int dayMin = loseVGr / loseWInDayMin;
        int dayMax = loseVGr / loseWInDayMax;
        int dayMiddle = (dayMin + dayMax) / 2;
        System.out.println ( dayMin );
        System.out.println (dayMax );
        System.out.println (dayMiddle );
        // Задача 8
    int mashaSalary = 67760;
    int denisSalary = 83690;
    int kristinaSalary = 76230;
    double salaryPerc = 0.10;
    double mashaNewSalary = mashaSalary * ( 1+ salaryPerc );
    double denisNewSalary = denisSalary * ( 1+ salaryPerc );
    double kristinaNewSalary = kristinaSalary * ( 1 + salaryPerc );
    double mashaSalaryDiff = mashaNewSalary - mashaSalary;
    double denisSalaryDiff = denisNewSalary - denisSalary;
    double kristinaSalaryDiff = kristinaNewSalary - kristinaSalary;
    double mashaAnnualDiff = mashaSalaryDiff * 12;
    double denisAnnualDiff = denisSalaryDiff * 12;
    double kristinaAnnualDiff = kristinaSalaryDiff * 12;
    System.out.println ( "Маша теперь получает " + mashaNewSalary + "рублей."  + " Годовой доход вырос на " +  mashaAnnualDiff + "рублей.");
    System.out.println ( "Денис теперь получает " + denisNewSalary + "рублей."  + " Годовой доход вырос на " + denisAnnualDiff  + "рублей." );
    System.out.println ( "Кристина теперь получает " + kristinaNewSalary + "рублей."  + " Годовой доход вырос на " +  kristinaAnnualDiff + "рублей." ) ;}}








