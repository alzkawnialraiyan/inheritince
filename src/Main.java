
public class Main {
    public static void main(String[] args) {
        Women girl = new Women();
        girl.gender="Female";
        girl.age = 21;
        System.out.println(girl.gender +"\t"+ girl.age);
        System.out.println(girl.isEmployee());
        System.out.println(girl.mother());

        Person p = new Person();
        System.out.println(p.isEmployee());

    }
}

class Person{
    String gender;
    boolean employee;
    boolean isEmployee(){
        return true;
    }
}
class Women extends Person{
    int age;
    boolean isMother;
    boolean mother(){
        if (age > 20){
            return true;
        }
        return false;
    }
    @Override
    boolean isEmployee() {
        //return super.isEmployee();
        if (age > 16){
        return true;
    }
        return false;
}}