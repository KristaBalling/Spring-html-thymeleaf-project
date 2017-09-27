package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @RequestMapping(path = "/new_student", method = RequestMethod.GET)
    public String getStudent(Model model) {
//        Student n = new Student("Amy", "Morin", Grade.Sixth);
//        Student n2 = new Student("Chris", "Mayfield", Grade.Tenth);
//
//        List<Student> students =
        model.addAttribute("grades", Grade.values());
        return "new_student";
    }


//    public String newStudent(Model model) {
//        model.addAttribute("grades", /* call the method on the Grade enum to get all the grades */);
//        return "new_student";
//    }
//
    @RequestMapping(path = "/create_student", method = RequestMethod.POST)
    public String createStudent(String firstName, String lastName, Grade grade, Model model) {


        /* set student firstName, lastName and grade using the http request parameters */
        Student student = new Student(firstName, lastName, grade);

        /* add the student to the model that will be used by the view_student html file */
        model.addAttribute("student", student);

        return "view_student";
    }
}
