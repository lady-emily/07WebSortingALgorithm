package org.example.controllers;

import org.example.models.Student;
import org.example.utils.SortingAlgorithms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @PostMapping("/sortStudents")
    public String sortStudents(@RequestParam String[] names, @RequestParam String algorithm, Model model) {
        List<Student> students = processStudents(names, algorithm);
        model.addAttribute("students", students);
        return "class-assignment";  // This corresponds to class-assignment.jsp or .html
    }

    public List<Student> processStudents(String[] names, String algorithm) {
      //  List<String> sortedNames = new ArrayList<>(names);

        // Sort the names based on the algorithm
        switch (algorithm) {
            case "Heap Sort":
                SortingAlgorithms.heapSort(names);
                break;
            case "Merge Sort":
                SortingAlgorithms.mergeSort(names, 0, names.length - 1);
                break;
            case "Radix Sort":
                SortingAlgorithms.radixSort(names);
                break;
            default:
                throw new IllegalArgumentException("Unknown sorting algorithm");
        }

        // Assign classes
        List<Student> students = new ArrayList<>();
        for (String name : names) {
            students.add(new Student(name, assignClass(name)));
        }
        return students;
    }

    private String assignClass(String name) {
        char initial = Character.toUpperCase(name.charAt(0));
        if (initial >= 'A' && initial <= 'E') return "Class 1 (Red - Abigail)";
        if (initial >= 'I' && initial <= 'J') return "Class 2 (Blue - Sean)";
        if (initial >= 'K' && initial <= 'O') return "Class 3 (Yellow - Frank)";
        if (initial >= 'P' && initial <= 'T') return "Class 4 (White - Maddison)";
        return "Class 5 (Grey - Ella)";
    }
}
