import java.util.ArrayList;

public class management {
    private ArrayList<Employee> employees;
    public management(){
        employees = new ArrayList<Employee>();
    }

    protected void addEmployee(Employee employee){
        if(employees.isEmpty()){
            employee.setIndex(0);
            employees.add(employee);
            addCall();
            return;
        }

        if(NameCompare(employee, employees.get(0)) < 0){
            employee.setIndex(0);
            employees.add(0, employee);
            addCall();
            return;
        } //小于第一号姓名

        if(NameCompare(employee, employees.get(employees.size() - 1)) == 0){
            employee.setIndex(employees.get(employees.size() - 1).getIndex() + 1);
            employees.add(employee);
            addCall();
            return;
        } //与最后一号姓名相同

        if(NameCompare(employee, employees.get(employees.size() - 1)) > 0){
            employee.setIndex(0);
            employees.add(employee);
            addCall();
            return;
        } //大于最后一号姓名
        employeeSort(employee);
    }
    private void employeeSort(Employee employee){
        for (int i = 0; i < employees.size(); i++) {
            if(NameCompare(employee, employees.get(i)) < 0){
                if(NameCompare(employee, employees.get(i-1)) == 0){
                    employee.setIndex(employees.get(i-1).getIndex() + 1);
                    employees.add(i, employee);
                }// 与前一位姓名相同

                else {//否则与前一位不同，那么就是新名字
                    employee.setIndex(0);
                    employees.add(i, employee);
                }
                addCall();
                return;
            }
        }
    }
    private int NameCompare(Employee A, Employee B){
        return A.getName().compareTo(B.getName());
    }
    private void addCall(){
        System.out.println("add success");
    }

    protected void deleteEmployee(String name, int index){
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getName().equals(name) && employees.get(i).getIndex() == index){
                employees.remove(i);
                System.out.println("delete success");
                return;
            }
        }

        System.out.println("no such employee");
    }

    protected void inputAllEmployees(){
        for (int i = 0; i < employees.size(); i++) {
            System.out.print(employees.get(i).getName() + "#" + employees.get(i).getIndex());
            System.out.print(" ");
        }
    }
}
