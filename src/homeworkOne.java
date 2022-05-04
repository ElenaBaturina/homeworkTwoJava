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


    }
    private int id;
    private String name;
    private String position;
    private int age;
    public homeworkOne(int id, String name, String position, int age) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.age = age;
    }
    public void info() {
        System.out.println("id: " + id + "; Имя пользователя: " + name+ "Должность: " + position + "; Возраст: " + age);
    }
    public void changePosition(String position) {
        this.position = position;
        System.out.println("Пользователь " + name + " получил новую должность: "
                + position);
    }



}
