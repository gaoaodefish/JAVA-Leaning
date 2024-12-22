package test4;

public class Employee {
    private String id;
    private String name;

    public Employee(String id, String name) throws IllegalArgumentException {
        if (id == null || id.length() != 5) {
            throw new IllegalArgumentException("Invalid ID length: " + id);
        }
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("ID: " + id + " 姓名：" + name);
    }
}
