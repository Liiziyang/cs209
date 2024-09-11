import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        management man = new management();
        Employee A = new Employee("A", 18);
        Employee B = new Employee("B", 19);
        Employee C = new Employee("C", 20);
        Employee D = new Employee("D", 21);

        Employee A1 = new Employee("A", 31);

        test1(man, A, B, C);
        test2(man);
        test3(man, A1, D);
        man.inputAllEmployees();
    }
    public static void test1(management man, Employee A, Employee B, Employee C){
        man.addEmployee(A);
        man.addEmployee(B);
        man.addEmployee(C);
    }
    public static void test2(management man){
        man.deleteEmployee("B", 0);
    }
    public static void test3(management man, Employee A1, Employee D){
        man.addEmployee(A1);
        man.addEmployee(D);
    }
}