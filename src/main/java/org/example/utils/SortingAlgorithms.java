package org.example.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingAlgorithms {

    // Heap Sort for Strings
    public static void heapSort(String[] arr) {
        int n = arr.length;

        // Build heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            String temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    private static void heapify(String[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left].compareToIgnoreCase(arr[largest]) > 0) {
            largest = left;
        }

        if (right < n && arr[right].compareToIgnoreCase(arr[largest]) > 0) {
            largest = right;
        }

        if (largest != i) {
            String swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    // Merge Sort for Strings
    public static void mergeSort(String[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(String[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        String[] L = new String[n1];
        String[] R = new String[n2];

        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i].compareToIgnoreCase(R[j]) <= 0) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Radix Sort for Strings
    public static void radixSort(String[] arr) {
        int maxLength = findMaxLength(arr);

        for (int pos = maxLength - 1; pos >= 0; pos--) {
            countSortByPosition(arr, pos);
        }
    }

    private static void countSortByPosition(String[] arr, int pos) {
        int n = arr.length;
        String[] output = new String[n];
        int[] count = new int[256];

        for (String value : arr) {
            int charValue = pos < value.length() ? value.toLowerCase().charAt(pos) : 0;
            count[charValue]++;
        }

        for (int i = 1; i < 256; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int charValue = pos < arr[i].length() ? arr[i].toLowerCase().charAt(pos) : 0;
            output[count[charValue] - 1] = arr[i];
            count[charValue]--;
        }

        System.arraycopy(output, 0, arr, 0, n);
    }

    private static int findMaxLength(String[] arr) {
        int max = arr[0].length();
        for (String value : arr) {
            if (value.length() > max) {
                max = value.length();
            }
        }
        return max;
    }
}
