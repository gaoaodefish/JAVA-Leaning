package test4;

public class TestEmployee1 {
    public static void main(String[] args) {
        try {
            Employee employee = new Employee("1002", "张三");
            employee.print();
            System.out.println(employee instanceof Employee);
        } catch (IllegalArgumentException e) {
            System.out.println("创建对象时发生异常：" + e.getMessage());
        }
    }
}

