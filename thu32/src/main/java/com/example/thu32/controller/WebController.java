package com.example.thu32.controller;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

//import com.bus.service.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
//
//import com.bus.beans.Customer;
//import com.bus.beans.MovieDetails;
//import com.bus.beans.OrderHistory;
//import com.bus.beans.Seat;
//import com.bus.service.CustomerDao;


@Controller
public class WebController {
    @GetMapping("/")
    public String home(Model m, HttpSession session) {
//
//        String movie = (String) session.getAttribute("movieName");
//        System.out.println(movie + "========Index");
//        //List<MovieDetails> movie2 = dao.getAllMovie();
//        m.addAttribute("movieList", movie2);
//        m.addAttribute("menu", "home");

        return "templates/main-dashboard";
    }
}
