package com.example.newhtmlproject.Controller;


import com.example.newhtmlproject.Model.DTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "Home/index";
    }

    @GetMapping("/about")
    public String about() {
        return "Home/about";
    }

    @GetMapping("/terminator")
    public String terminator() {
        return "Home/terminator";
    }

    @PostMapping("/terminatorcalc")
    public String terminatorcalc(@ModelAttribute DTO dto) {
        String result = "";
        String terminatorYes = "terminatorYes";
        String terminatorNo = "terminatorNo";

        String value_1 = dto.getValue_1();


        if (value_1.equalsIgnoreCase("yes")) {
            result = terminatorYes;

        } else if (value_1.equalsIgnoreCase("no")) {
            result = terminatorNo;

        } else {
            result = terminatorYes;
        }

        return "Home/"+result;


    }

}
