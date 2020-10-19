package DataStructure.sort;

public class BubbleSort {
    //sort array a from small to big
    public void bubbleSort(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j+1] = tmp;
                    flag = true;
                }
            }
            if(!flag) break;
        }

    }
}
