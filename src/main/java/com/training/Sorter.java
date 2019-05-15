package com.training;

public class Sorter {
    public int arr[];

    public Sorter() { }

    public void doBubbleSort(int a[]) {
        if (a == null) {
            return;
        }

        this.arr = a;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    public void doSelectionSort(int a[]) {
        if (a == null) {
            return;
        }

        this.arr = a;
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int minInd = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minInd = j;
                }
            }

            int temp = arr[minInd];
            arr[minInd] = arr[i];
            arr[i] = temp;
        }
    }

    public void doInsertionSort(int a[]) {
        if (a == null) {
            return;
        }

        this.arr = a;
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public void doQuickSort(int[] a) {
        this.arr = a;
        if (a == null || a.length == 0) {
            return;
        }

        int length = a.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int low, int high) {
        int i = low;
        int j = high;

        int pivot = this.arr[low + (high - low) / 2];
        while (i <= j) {
            while (this.arr[i] < pivot) {
                i++;
            }
            while (this.arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = this.arr[i];
                this.arr[i] = this.arr[j];
                this.arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(low, j);
        }

        if (i < high) {
            quickSort(i, high);
        }
    }
}
