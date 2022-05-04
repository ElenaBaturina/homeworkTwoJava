public class homeworkOne {

    public static void main(String[] args) {
        double gallons; // в этой переменной хранится значение ,
        // вьражающее объем жидкости в галлонах
        double liters; // в этой переменной хранится значение ,
        // вьражающе е объем жидкости в литрах
        gallons = 10; // начать ное значение соответст вует 10 галлонам
        liters = gallons * 3.7854; // перевод в литры
        System.out.println(gallons + " галлонам соответствует " +
                liters + " литра ");


        int x;
        for ( x = 0; x < 6; x++ ) {
            if ( x == 1)
                System.out.println(" x равно 1");
            else if ( x == 2 )
                System.out.println(" x равно 2");
            else if ( x == 3 )
                System.out.println(" x равно 3 ");
            else if ( x == 4 )
                System.out.println("x равно 4");
            else
                System.out.println(" Знaчeниe х н аходится вне диапазона 1 - 4 ");
        }

        }


}
