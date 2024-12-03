//package org.example.controllers;
//
//import org.example.utils.SortingAlgorithms;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Main {
//    public static void main(String[] args) {
//        // Test data: Names of students
//        String[] studentNames = {
//                "Alice", "John", "Michael", "Peter", "Sarah", "Emily", "Kate",
//                "Olivia", "Ian", "Paul", "Uma", "Zara", "Victor", "Nathan", "Quincy"
//        };
//
//        System.out.println("Original Names:");
//        printArray(studentNames);
//
//        // Sorting with Heap Sort
//        System.out.println("\nHeap Sorted Names:");
//        String[] heapSortedNames = studentNames.clone();
//        SortingAlgorithms.heapSort(heapSortedNames);
//        printArray(heapSortedNames);
//
//        // Sorting with Merge Sort
//        System.out.println("\nMerge Sorted Names:");
//        String[] mergeSortedNames = studentNames.clone();
//        SortingAlgorithms.mergeSort(mergeSortedNames, 0, mergeSortedNames.length - 1);
//        printArray(mergeSortedNames);
//
//        // Sorting with Radix Sort (requires transformation for radix compatibility)
//        System.out.println("\nRadix Sorted Names:");
//        String[] radixSortedNames = studentNames.clone();
//        SortingAlgorithms.radixSort(radixSortedNames);
//        printArray(radixSortedNames);
//
//        // Assign students to classrooms based on Heap Sort result
//        System.out.println("\nClassroom Assignments (Based on Heap Sort):");
//        Map<Integer, List<String>> classrooms = assignToClassrooms(heapSortedNames);
//        for (Map.Entry<Integer, List<String>> entry : classrooms.entrySet()) {
//            System.out.println("Class " + entry.getKey() + ": " + entry.getValue());
//        }
//    }
//
//    // Method to print a string array
//    private static void printArray(String[] arr) {
//        for (String value : arr) {
//            System.out.print(value + " ");
//        }
//        System.out.println();
//    }
//
//    // Method to assign students to classrooms
//    private static Map<Integer, List<String>> assignToClassrooms(String[] studentNames) {
//        Map<Integer, List<String>> classrooms = new HashMap<>();
//
//        // Initialize classrooms
//        for (int i = 1; i <= 5; i++) {
//            classrooms.put(i, new ArrayList<>());
//        }
//
//        // Assign students to classrooms based on their first letter
//        for (String name : studentNames) {
//            char firstLetter = name.toUpperCase().charAt(0);
//            if (firstLetter >= 'A' && firstLetter <= 'E') {
//                classrooms.get(1).add(name);
//            } else if (firstLetter >= 'I' && firstLetter <= 'J') {
//                classrooms.get(2).add(name);
//            } else if (firstLetter >= 'K' && firstLetter <= 'O') {
//                classrooms.get(3).add(name);
//            } else if (firstLetter >= 'P' && firstLetter <= 'T') {
//                classrooms.get(4).add(name);
//            } else if (firstLetter >= 'U' && firstLetter <= 'Z') {
//                classrooms.get(5).add(name);
//            }
//        }
//
//        return classrooms;
//    }
//}
//
