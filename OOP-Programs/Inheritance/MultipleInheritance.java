interface Father {
    void fatherSkill();
}

interface Mother {
    void motherSkill();
}

class Child implements Father, Mother {
    public void fatherSkill() { System.out.println("Hard work"); }
    public void motherSkill() { System.out.println("Care"); }
    void ownSkill() { System.out.println("Coding"); }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.fatherSkill();
        c.motherSkill();
        c.ownSkill();
    }
}
