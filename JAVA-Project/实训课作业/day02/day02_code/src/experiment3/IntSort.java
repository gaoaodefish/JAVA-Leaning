package experiment3;

class IntSort {
    public String sort(int a, int b) {
        if (a < b) {
            return a + " " + b;
        } else {
            return b + " " + a;
        }
    }

    public String sort(int a, int b, int c) {
        int swap;
        if (a > b) {
            swap = a;
            a = b;
            b = swap;
        }
        if (a > c) {
            swap = a;
            a = c;
            c = swap;
        }
        if (b > c) {
            swap = b;
            b = c;
            c = swap;
        }
        return a + " " + b + " " + c;
    }

    public String sort(int a, int b, int c, int d) {
        int swap;
        if (a > b) {
            swap = a;
            a = b;
            b = swap;
        }
        if (a > c) {
            swap = a;
            a = c;
            c = swap;
        }
        if (b > c) {
            swap = b;
            b = c;
            c = swap;
        }
        if (d < c) {
            if (d < b) {
                if (d < a) {
                    swap = d;
                    d = a;
                    a = swap;
                    swap = d;
                    d = b;
                    b = swap;
                    swap = c;
                    c = d;
                    d = swap;
                } else {
                    swap = d;
                    d = b;
                    b = swap;
                    swap = c;
                    c = d;
                    d = swap;
                }
            } else {
                swap = d;
                d = c;
                c = swap;
            }
        }
        return a + " " + b + " " + c + " " + d;
    }

    public String sort(int[] arr) {
        String s = "";
        int swap;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            s += arr[i] + " ";
        }
        return s;
    }
}

class Exercise {
    public static void main(String[] args) {
        IntSort s = new IntSort();
        int a = 30, b = 12, c = 40;
        int[] arr = {5, 21, 4, 8};
        System.out.println("两个数的排序结果：" + s.sort(a, b));
        System.out.println("三个数的排序结果：" + s.sort(a, b, c));
        System.out.println("数组的排序结果：" + s.sort(5, 21, 4, 8));
    }
}