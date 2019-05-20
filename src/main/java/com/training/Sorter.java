package com.training;

public class Sorter {
    public Sorter() { }

    public void doBubbleSort(int a[]) {
        if (a == null) {
            return;
        }

        boolean swappingHappened;
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            swappingHappened = false;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swappingHappened = true;
                }
            }
            if (!swappingHappened) {
                break;
            }
        }
    }

    public void doSelectionSort(int a[]) {
        if (a == null) {
            return;
        }

        for (int i = 0; i < a.length - 1; i++) {
            int min = a[i];
            int minInd = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    minInd = j;
                }
            }

            int temp = a[minInd];
            a[minInd] = a[i];
            a[i] = temp;
        }
    }

    public void doInsertionSort(int a[]) {
        if (a == null) {
            return;
        }

        for (int i = 1; i < a.length; ++i) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
    }

    public void doQuickSort(int[] a) {
        if (a == null || a.length == 0) {
            return;
        }

        int length = a.length;
        quickSort(0, length - 1, a);
    }

    private void quickSort(int low, int high, int[] a) {
        int i = low;
        int j = high;

        int pivot = a[low + (high - low) / 2];
        while (i <= j) {
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(low, j, a);
        }

        if (i < high) {
            quickSort(i, high, a);
        }
    }
}
