class Student {
    private String name;
    private int age;

    public void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public static void main(String[] args) {
        Student s = new Student();
        s.setData("Ali", 20);
        System.out.println(s.getName() + " " + s.getAge());
    }
}
