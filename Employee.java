public class Employee {
    private String name;
    private int age;
    private int index;
    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
    protected String getName(){
        return name;
    }
    protected int getAge(){
        return age;
    }
    protected int getIndex(){
        return index;
    }

    protected void setName(String input){
        name = input;
    }
    protected void setAge(int input){
        age = input;
    }
    protected void setIndex(int input){
        index = input;
    }

}
