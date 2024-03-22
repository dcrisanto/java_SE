public class DataTypes {
    public static void main(String[] args) {
        int n = 1234567890; // max 10 digitos - 4 bytes
        long nL = 12345678901L; //8 bytes
        float nF = 12345.12344F;//float 4 bytes
       double nD = 12345.4567; //double 8 bytes
        // a partir de java 10 se puede usar var la cual identifica que tipo de variable
        var salary = 1000; //int
        //pension 3% of salary
        var pension = salary*0.03; //double
        var totalSalary = salary - pension; //double
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var nameEmployee = "Dorelly Crisanto";
        System.out.println("Employee: " + nameEmployee + " Salary: " + totalSalary);

        //char: 2bytes, comillas simples y un solo elemento
        //boolean:2bytes, rango true or false
    }
}
