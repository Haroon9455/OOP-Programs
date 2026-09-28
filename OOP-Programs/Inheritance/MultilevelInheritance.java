class Person {
    void showPerson() { System.out.println("I am a person"); }
}

class Student extends Person {
    void showStudent() { System.out.println("I am a student"); }
}

class Result extends Student {
    void showResult() { System.out.println("Result: Pass"); }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Result r = new Result();
        r.showPerson();
        r.showStudent();
        r.showResult();
    }
}
