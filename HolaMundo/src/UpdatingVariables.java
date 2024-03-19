public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        int bond = 200;
        int pension = 50;
        int priceExtraHour = 30;
        int extraHours = 2;
        int meal = 45;
        salary += (bond + priceExtraHour*extraHours) - (pension + meal);
        String name = "Dorelly del Rosario";
        String lastName = "Crisanto Silupú";
        System.out.println("Employee: " + name + " " + lastName + ", su salario es " + salary);

    }
}
