package experiment3;

public class User {
        private String userName, password;

        User() {
//            System.out.println("全部为空");
        }

        User(String name) { // 重载构造方法，其中包含一个参数 name
            userName = name;
        }

        User(String name, String pwd) { // 重载构造方法，其中包含两个参数 name 和 pwd
            this(name);
            password = pwd;
            check();
        }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    void check() {
            String s = null;
            if (userName != null)
                s = "用户名：" + userName;
            else
                s = "用户名不能为空！";
            if (password.equals("12345678"))
                s += " 密码有效！";
            else
                s += " 密码无效！";
            System.out.println(s);
        }
}

    class Exercise2 {
        public static void main(String[] args) {
//            new User();
//            new User("刘新宇");
//            new User(null, "密码");
//            new User("张三", "12345678");

            User user1 = new User();
            user1.setUserName("张三");
            user1.setPassword("123");
            System.out.println(user1.getUserName());
            System.out.println(user1.getPassword());
        }
    }

