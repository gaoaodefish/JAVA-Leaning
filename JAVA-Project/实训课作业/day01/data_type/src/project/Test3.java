package project;

public class Test3 {
    public static void main(String[] args) {
        int i = 1;
        while(i < 10)
        {
            int j = 1;
            while(j <= i) {
                System.out.printf("%d * %d = %d\t", i, j, i*j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
