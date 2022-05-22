public class HomeWork3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] arr6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] arr7 = {1, 1, 2, 2};
        System.out.println("Task 1: ");
        doTask1(arr1);
        System.out.println("\nTask 2: ");
        doTask2(100);
        System.out.println("\nTask 3: ");
        doTask3(arr3);
        System.out.println("\nTask 4: ");
        doTask4();
        System.out.println("\nTask 5: ");
        doTask5(5, 1);
        System.out.println("\nTask 6: ");
        doTask6(arr6);
        System.out.println("\nTask 7: ");
        System.out.println(doTask7(arr7));
    }

    public static void doTask1(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void doTask2(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    public static void doTask3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void doTask4() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void doTask5(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }

    public static void doTask6( int[] arr){
        int max = arr[0];
        int min = arr[0];

        for (int k : arr) {
            if (k > max) {
                max = k;
            }
        }
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    public static boolean doTask7 ( int[] arr){
        int rightSum = 0;
        int leftSum = 0;
        // ������ ����� ���� ���������
        for (int k : arr) {
            rightSum += k;
        }

        for (int j : arr) {
            leftSum += j;
            if (leftSum == rightSum - leftSum) {
                return true;
            }
        }
        return false;
    }
}



